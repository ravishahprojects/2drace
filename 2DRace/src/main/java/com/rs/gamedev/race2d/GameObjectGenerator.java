/**
 * 
 */
package com.rs.gamedev.race2d;

import com.rs.gamedev.race2d.frames.MainFrame;
import com.rs.gamedev.race2d.panels.MainPanel;
import com.rs.gamedev.race2d.panels.OptionsPanel;

/**
 * @author RShah
 * 
 */
public class GameObjectGenerator {

	private MainFrame mainFrame;
	private MainPanel mainPanel;
	private OptionsPanel optionsPanel;

	public GameObjectGenerator() {
		mainFrame = new MainFrame();
	}

	public void initialize() {
		mainPanel = new MainPanel();
		mainFrame.add(mainPanel);
		optionsPanel = new OptionsPanel();
		mainFrame.add(optionsPanel);
	}

}
