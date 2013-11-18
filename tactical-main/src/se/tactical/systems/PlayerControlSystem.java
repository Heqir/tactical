package se.tactical.systems;

import com.artemis.Aspect;
import com.artemis.Entity;
import com.artemis.EntitySystem;
import com.artemis.utils.ImmutableBag;

/**
 * This system updates the player controlled entities.
 */
public class PlayerControlSystem extends EntitySystem {

	/**
	 * Constructs a new PlayerControlSystem.
	 */
	public PlayerControlSystem(Aspect aspect) {
		super(aspect);
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
		
	}
}
