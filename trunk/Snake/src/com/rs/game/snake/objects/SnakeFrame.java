package com.rs.game.snake.objects;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.rs.game.snake.SnakeContext;
import com.rs.game.snake.structure.SnakeGameStructure;

public class SnakeFrame extends JFrame implements KeyListener,
		SnakeGameStructure {

	private static final long serialVersionUID = 754649565954943453L;
	private SnakeContext context = SnakeContext.getInstance();
	private SnakePanel mainPanel;

	public SnakeFrame() {
		initialize();
	}

	private void addComponents() {
		mainPanel = new SnakePanel();
		add(mainPanel);
//		DebugPanel debugPanel = new DebugPanel();
//		add(debugPanel);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		mainPanel.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		mainPanel.keyReleased(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		mainPanel.keyTyped(e);
	}

	@Override
	public void initialize() {
		setBounds(100, 100, context.getScreenWidth(), context.getScreenHeight());
		setBackground(Color.white);
		setLayout(null);
		setTitle("Snake - By Ravi Shah");
		addKeyListener(this);
		addComponents();
		// setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}