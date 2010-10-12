/**
 * 
 */
package com.rs.game.snake.structure;

import javax.swing.JPanel;

import com.rs.game.snake.SnakeContext;
import com.rs.game.snake.objects.SnakePieceType;

/**
 * @author Ravi
 * 
 */
public class SnakePiece extends JPanel implements SnakeGameStructure {

	private static final long serialVersionUID = -1637468560001948748L;
	private int width = SnakeContext.getInstance().getPieceWidth();
	private int height = SnakeContext.getInstance().getPieceHeight();
	private SnakePieceType pieceType;
	private int x;
	private int y;

	public SnakePiece(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.rs.game.snake.structure.SnakeGameStructure#initialize()
	 */
	@Override
	public void initialize() {
		setBounds(x, y, width, height);
		setLayout(null);
		setVisible(true);
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the pieceType
	 */
	public SnakePieceType getPieceType() {
		return pieceType;
	}

	/**
	 * @param pieceType
	 *            the pieceType to set
	 */
	public void setPieceType(SnakePieceType pieceType) {
		this.pieceType = pieceType;
		setBackground(this.pieceType.getColor());
	}
}