package com.rs.game.snake;

import com.rs.game.snake.objects.SnakeFrame;

public class SnakeMain {

	public static void main(String[] args) {
		SnakeContext context = SnakeContext.getInstance();
		context.setScreenWidth(800);
		context.setScreenHeight(600);
		context.setPieceWidth(10);
		context.setPieceHeight(10);
		context.setInitialPieceLength(5);
		context.setFrame(new SnakeFrame());
	}
}
