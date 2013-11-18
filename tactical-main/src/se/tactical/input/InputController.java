package se.tactical.input;

import com.badlogic.gdx.InputProcessor;

/**
 * This system handles all user input by delegating it to the appropriate handler.
 */
public class InputController implements InputProcessor {

	/**
	 * Called on key down.
	 * @param keycode A code representing a specific key
	 */
	@Override
	public boolean keyDown(int keycode) {
		return false;
	}
	
	/**
	 * Called on key up.
	 * @param keycode A code representing a specific key
	 */
	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	/**
	 * Called on key typed.
	 * @param character The character that was typed.
	 */
	@Override
	public boolean keyTyped(char character) {
		return false;
	}
	
	/**
	 * To be added
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	/**
	 * To be added
	 */
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	/**
	 * To be added
	 */
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	/**
	 * Called on moved mouse.
	 * @param screenX The x-coordinate of the mouse.
	 * @param screenY The y-coordinate of the mouse.
	 */
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}
	
	/**
	 * Called on mouse scroll.
	 * @param amount The amount that has been scrolled since last tick.
	 */
	@Override
	public boolean scrolled(int amount) {
		return false;
	}

}
