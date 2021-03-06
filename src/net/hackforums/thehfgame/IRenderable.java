package net.hackforums.thehfgame;

/**
 * This interface is used for any
 * objects that are render-able.
 * Most classes will inherit or use this interface.
 * @author Yusuf
 *
 */
public interface IRenderable {

	/**
	 * Invoked on every frame processed.
	 */
	abstract void onRender();
	/**
	 * Invoked on every frame processed.
	 */
	abstract void onUpdate();
}
