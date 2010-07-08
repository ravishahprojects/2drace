/**
 * 
 */
package com.rs.gamedev.race2d;

/**
 * @author RShah
 * 
 */
public class Main {

	private GameObjectGenerator generator;

	public Main() {
		generator = new GameObjectGenerator();
		initialize();
	}

	private void initialize() {
		generator.initialize();
	}
}
