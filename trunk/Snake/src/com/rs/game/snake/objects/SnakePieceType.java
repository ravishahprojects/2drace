package com.rs.game.snake.objects;

import java.awt.Color;

public enum SnakePieceType {
	HEAD(Color.yellow, ""), TAIL(Color.red, ""), SPACER(Color.black, ""), BODY(
			Color.white, "");

	private Color color;

	private SnakePieceType(Color color, String bgImage) {
		this.color = color;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}
}
