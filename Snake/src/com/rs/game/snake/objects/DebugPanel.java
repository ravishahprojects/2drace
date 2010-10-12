/**
 * 
 */
package com.rs.game.snake.objects;

import java.awt.Color;

import javax.swing.JPanel;

import com.rs.game.snake.SnakeContext;
import com.rs.game.snake.structure.SnakeGameStructure;

/**
 * @author Ravi
 * 
 */
public class DebugPanel extends JPanel implements SnakeGameStructure {
	private static final long serialVersionUID = -7781276443895545453L;
	private SnakeContext context = SnakeContext.getInstance();

	public DebugPanel() {
		initialize();
	}

	@Override
	public void initialize() {
		int mainPanelWidth = context.getMainPanelWidth();
		SnakeFrame snakeFrame = context.getFrame();
		setBounds(0, 0, snakeFrame.getWidth() - mainPanelWidth, snakeFrame
				.getHeight());
		setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}

}
