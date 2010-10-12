package com.rs.game.snake.objects;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

import com.rs.game.snake.SnakeContext;
import com.rs.game.snake.structure.Move;
import com.rs.game.snake.structure.SnakeGameStructure;
import com.rs.game.snake.structure.SnakePiece;
import com.rs.game.snake.structure.Spacer;

public class SnakePanel extends JPanel implements KeyListener,
		SnakeGameStructure {

	private static final long serialVersionUID = 7458069111063321188L;
	private SnakeContext context = SnakeContext.getInstance();
	private int initialPieceLength = context.getInitialPieceLength();
	private List<SnakePiece> pieces = new ArrayList<SnakePiece>(
			initialPieceLength);
	private int panelWidth;
	private int panelHeight;
	private final int pieceWidth = context.getPieceWidth();
	private final int pieceHeight = context.getPieceHeight();
	private int spacerWidth = 5;
	private final int pieceMove = pieceWidth + spacerWidth;
	private Rectangle lastBounds;

	public SnakePanel() {
		initialize();
	}

	@Override
	public void initialize() {
		panelWidth = context.getMainPanelWidth();
		panelHeight = context.getMainPanelHeight();
		setBounds(0, 0, panelWidth, panelHeight);
		setBackground(Color.black);
		setLayout(null);
		addKeyListener(this);
		addBody();
		setVisible(true);
	}

	private void addBody() {
		for (int i = 0; i < initialPieceLength; i++) {
			SnakePiece piece = getPiece(i);
			add(piece);
			// Spacer spacer = getSpacer(i);
			// add(spacer);
			pieces.add(piece);
		}
		Collections.reverse(pieces);
	}

	@SuppressWarnings("unused")
	private Spacer getSpacer(int i) {
		Spacer piece = new Spacer(i * pieceMove, pieceWidth);
		return piece;
	}

	private SnakePiece getPiece(int i) {
		SnakePiece piece = new SnakePiece(i * pieceMove, pieceWidth);
		setPieceType(i, piece);
		return piece;
	}

	private void setPieceType(int i, SnakePiece piece) {
		if (i == 0) {
			piece.setPieceType(SnakePieceType.TAIL);
		} else if (i == initialPieceLength - 1) {
			piece.setPieceType(SnakePieceType.HEAD);
		} else {
			piece.setPieceType(SnakePieceType.BODY);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		Move move = Move.parseValue(keyCode);
		if (move != null) {
			moveSnake(move);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// DO NOTHING
	}

	private void moveSnake(Move move) {
		switch (move) {
		case DOWN:
			moveDown();
			break;
		case RIGHT:
			moveRight();
			break;
		case UP:
			moveUp();
			break;
		case LEFT:
			moveLeft();
			break;
		}
		lastBounds = null;
	}

	private void moveLeft() {
		movePieces(Move.LEFT);
	}

	private void movePieces(Move move) {
		for (int i = 0; i < pieces.size(); i++) {
			SnakePiece piece = pieces.get(i);
			if (piece.getPieceType() == SnakePieceType.HEAD) {
				movePiece(piece, move);
			} else {
				// Move this piece to last piece's position and copy this
				// piece's bounds for next piece
				Rectangle bounds = piece.getBounds();
				piece.setBounds(lastBounds);
				lastBounds = bounds;
			}
		}
	}

	private void moveUp() {
		movePieces(Move.UP);
	}

	private void moveRight() {
		movePieces(Move.RIGHT);
	}

	private void moveDown() {
		movePieces(Move.DOWN);
	}

	// TODO: [RS] Give some better and logical name
	private void movePiece(SnakePiece piece, Move move) {
		int x2 = piece.getX();
		int y2 = piece.getY();
		int width2 = piece.getWidth();
		int height2 = piece.getHeight();
		int newX = 0, newY = 0;
		// Remember this piece's last position, next node will be blindly moved
		// to this location. But this can be done even without a local variable.
		// TODO: [RS] Remove this variable
		lastBounds = piece.getBounds();
		switch (move) {
		case RIGHT:
			newX = x2 + pieceMove;
			newY = y2;
			if (getY() + getWidth() < newX) { // Right Border
				// Move down
				newX -= pieceMove;
				newY += pieceMove;
			}
			break;
		case LEFT:
			newX = x2 - pieceMove;
			newY = y2;
			if (getX() > newX) { // Left Border
				// Move down
				newX += pieceMove;
				newY += pieceMove;
			}
			break;
		case UP:
			newX = x2;
			newY = y2 - pieceMove;
			if (getY() + pieceHeight > newY) { // Upper Border
				// Move Right
				newX += pieceMove;
				newY += pieceMove;
			}
			break;
		case DOWN:
			newX = x2;
			newY = y2 + pieceMove;
			if (getY() > newY) { // Lower Border
				// Move Left
				newX -= pieceMove;
				newY -= pieceMove;
			}
			break;
		}
		piece.setBounds(newX, newY, width2, height2);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// DO NOTHING
	}
}