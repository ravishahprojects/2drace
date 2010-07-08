/**
 * 
 */
package com.rs.gamedev.race2d.panels;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * @author RShah
 * 
 */
public class MainPanel extends JPanel {

	private static final long serialVersionUID = 817345852379222726L;
	private RightPanel rightPanel;
	private CenterPanel centerPanel;
	private LeftPanel leftPanel;

	public MainPanel() {
		rightPanel = new RightPanel();
		centerPanel = new CenterPanel();
		leftPanel = new LeftPanel();
		initialize();
	}

	private void initialize() {
		GridLayout gridLayout = new GridLayout(1, 3);
//		Border border = new 
//		setBorder();
		setLayout(gridLayout);

		add(leftPanel);
		add(centerPanel);
		add(rightPanel);

	}
}
