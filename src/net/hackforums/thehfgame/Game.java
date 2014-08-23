package net.hackforums.thehfgame;

/**
 * The game component class.
 *
 */
public class Game {

	private Screen currentScreen;
	
	public void start() {
		setScreen(new ScreenMainMenu(this));
	}
	
	public void stop() {
		
	}
	
	public void setScreen(Screen screen) {
		if(currentScreen != null) {
			currentScreen.onExit();
		}
		
		currentScreen = screen;
		
		currentScreen.onEnter();
	}
}
