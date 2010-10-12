/**
 * 
 */
package com.rs.game.snake.structure;

/**
 * @author Ravi
 * 
 */
public enum Move {
	LEFT(37), RIGHT(39), UP(38), DOWN(40);

	private int move;

	private Move(int move) {
		this.move = move;
	}

	/**
	 * @return the move
	 */
	public int getMove() {
		return move;
	}

	/**
	 * @param move
	 *            the move to set
	 */
	public void setMove(int move) {
		this.move = move;
	}

	public static Move parseValue(int value) {
		Move[] moves = Move.values();
		for (Move move : moves) {
			if (move.getMove() == value) {
				return move;
			}
		}
		return null;
	}
}