package com.rs.game.snake;

import com.rs.game.snake.objects.SnakeFrame;

public class SnakeContext {

	private int screenWidth;
	private int pieceWidth;
	private int screenHeight;
	private int pieceHeight;
	private int initialPieceLength;
	private double mainPanelRatio = 0.80;
	private static SnakeContext instance;
	private SnakeFrame frame;

	/**
	 * @param screenWidth
	 *            the screenWidth to set
	 */
	void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	/**
	 * @return the screenWidth
	 */
	public int getScreenWidth() {
		return screenWidth;
	}

	/**
	 * @param screenHeight
	 *            the screenHeight to set
	 */
	void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	/**
	 * @return the screenHeight
	 */
	public int getScreenHeight() {
		return screenHeight;
	}

	/**
	 * @return the instance
	 */
	public static SnakeContext getInstance() {
		if (instance == null) {
			instance = new SnakeContext();
		}
		return instance;
	}

	/**
	 * @return the mainPanelWidth
	 */
	public int getMainPanelWidth() {
		return (int) (screenWidth * mainPanelRatio);
	}

	/**
	 * @return the mainPanelHeight
	 */
	public int getMainPanelHeight() {
		return screenHeight;
	}

	/**
	 * @return the pieceWidth
	 */
	public int getPieceWidth() {
		return pieceWidth;
	}

	/**
	 * @param pieceWidth
	 *            the pieceWidth to set
	 */
	void setPieceWidth(int pieceWidth) {
		this.pieceWidth = pieceWidth;
	}

	/**
	 * @return the pieceHeight
	 */
	public int getPieceHeight() {
		return pieceHeight;
	}

	/**
	 * @param pieceHeight
	 *            the pieceHeight to set
	 */
	void setPieceHeight(int pieceHeight) {
		this.pieceHeight = pieceHeight;
	}

	/**
	 * @param initialPieceLength
	 *            the initialPieceLength to set
	 */
	void setInitialPieceLength(int initialPieceLength) {
		this.initialPieceLength = initialPieceLength;
	}

	/**
	 * @return the initialPieceLength
	 */
	public int getInitialPieceLength() {
		return initialPieceLength;
	}

	/**
	 * @return the frame
	 */
	public SnakeFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame
	 *            the frame to set
	 */
	void setFrame(SnakeFrame frame) {
		this.frame = frame;
	}
}