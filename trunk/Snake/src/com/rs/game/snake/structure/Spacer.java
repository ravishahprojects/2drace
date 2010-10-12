/**
 * 
 */
package com.rs.game.snake.structure;

import java.awt.Color;

import javax.swing.JPanel;


/**
 * @author Ravi
 * 
 */
public class Spacer extends JPanel implements SnakeGameStructure {

	private static final long serialVersionUID = -594652181860172550L;
	private int x;
	private int y;

	public Spacer(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	@Override
	public void initialize() {
		setBounds(x, y, 5, 10);
		setBackground(Color.blue);
		setLayout(null);
//		Border b = BorderFactory.createLineBorder(Color.green);
//		setBorder(b);
		setVisible(true);
	}

}
