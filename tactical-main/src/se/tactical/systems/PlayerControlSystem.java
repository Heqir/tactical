package se.tactical.systems;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.EntitySystem;
import com.artemis.utils.ImmutableBag;
import com.badlogic.gdx.InputProcessor;

/**
 * This system handles all user input by delegating it to the appropriate handler.
 */
public class PlayerControlSystem extends EntitySystem implements InputProcessor {

	/**
	 * Constructs a new PlayerControlSystem.
	 */
	public PlayerControlSystem(Aspect aspect) {
		super(aspect);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * This method is called when the system is initialized
	 */
	@Override
	protected void initialize() {
	}	
	
	/**
	 * Determines if the system should be processed or not
	 * 
	 * @return true if system should be processed, false otherwise
	 */
	@Override
	protected boolean checkProcessing() {
		return true;
	}

	/**
	 * To be added
	 * @param entities the bag of entities with the wanted components
	 */
	@Override
	protected void processEntities(ImmutableBag<Entity> entities) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Called on key down.
	 * @param keycode A code representing a specific key
	 */
	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Called on key up.
	 * @param keycode A code representing a specific key
	 */
	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Called on key typed.
	 * @param character The character that was typed.
	 */
	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * To be added
	 */
	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * To be added
	 */
	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * To be added
	 */
	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Called on moved mouse.
	 * @param screenX The x-coordinate of the mouse.
	 * @param screenY The y-coordinate of the mouse.
	 */
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Called on mouse scroll.
	 * @param amount The amount that has been scrolled since last tick.
	 */
	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
