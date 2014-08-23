package net.hackforums.thehfgame;

/**
 * An interface used to represent the
 * framework of a screen.
 *
 */
@Documented
public interface IScreen extends IRenderable {

	/**
	 * Invokes when the screen is entered.
	 */
	abstract void onEnter();
	/**
	 * Invokes when the screen is exited.
	 */
	abstract void onExit();
	/**
	 * Adds a component to the screen.
	 * @param component
	 * @return true if addition of component is successful.
	 */
	abstract boolean addComponent(ScreenComponent component);
	/**
	 * Removes a component from the screen.
	 * @param component
	 * @return true if removal of component is successful.
	 */
	abstract boolean removeComponent(ScreenComponent component);
}
