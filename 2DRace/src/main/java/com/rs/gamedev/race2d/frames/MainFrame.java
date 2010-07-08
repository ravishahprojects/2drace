/**
 * MainFrame.java
 */
package com.rs.gamedev.race2d.frames;

import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * @author RShah
 * 
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = -8936847668944946815L;
	private Toolkit toolkit;

	public MainFrame() {
		toolkit = getToolkit();
		setSize(toolkit.getScreenSize());
		setUndecorated(true);
		setVisible(true);
	}
}
