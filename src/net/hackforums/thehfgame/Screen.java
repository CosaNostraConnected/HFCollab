package net.hackforums.thehfgame;

import java.util.ArrayList;

public abstract class Screen implements IScreen {

	/**
	 * 
	 */
	protected Game game;
	
	/**
	 * A list of the screen components currently
	 */
	protected ArrayList<ScreenComponent> screenComponents;

	public Screen(Game game) {
		this.game = game;
		this.screenComponents = new ArrayList<ScreenComponent>();
	}
}
