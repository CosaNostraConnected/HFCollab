package net.hackforums.thehfgame;

/**
 * Represents a component on the screen.
 * If not intended, all components should be
 * inside the borders of the screen.
 */
public abstract class ScreenComponent {

	protected Screen screen;
	
	/**
	 * This is used to tell whether or not
	 * the screen component is currently needed
	 * to be rendered at this time.
	 */
	protected boolean isVisible;
	
	public ScreenComponent(Screen screen) {
		this.screen = screen;
		this.isVisible = true;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	
}
