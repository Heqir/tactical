package se.tactical.entities;

/**
 * A factory for player controlled entities. 
 * 
 * Player controlled entities are created through this factory. 
 * All player controlled entities are placed in the PLAYERCONTROLLED group.
 * The methods are sorted in alphabetical order.
 * 
 * EXAMPLE METHOD (from Avoidance, slightly modified - BELOW SHOWN COMPONENTS AND GROUPS MAY NOT EXIST):
 * 
 *  /**
 *   * Creates a basicWarrior entity.
 *   *
 *   * @param world The world.
 *   * @return A basicWarrior entity.
 *   *\/
 *   
 *   public static Entity createBasicWarrior(World world){
 *   	Entity warrior = world.createEntity();
 *		world.getManager(GroupManager.class).add(warrior, "PLAYERCONTROLLED");
 *		world.getManager(GroupManager.class).add(enemy, "MOVINGENTITIES");
 *		world.getManager(GroupManager.class).add(enemy, "CIRCLESHAPES");
 *	
 *		enemy.addComponent(new Transform(xPos, yPos));
 *		enemy.addComponent(new Velocity());
 *		enemy.addComponent(new Size(64,64));
 *		enemy.addComponent(new Friction(0.7f));
 *		enemy.addComponent(new Acceleration(10));
 *		enemy.addComponent(new Spatial("warrior.png"));
 *		return enemy;
 *   }
 */
public class PlayerControlledEntityFactory {
	

}
