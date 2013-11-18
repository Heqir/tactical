package se.tactical.entities;

/**
 * A factory for enemy entities. 
 * 
 * Enemy entities are created through this factory. 
 * All enemy entities are placed in the ENEMY group.
 * The methods are sorted in alphabetical order.
 * 
 * EXAMPLE METHOD (from Avoidance, slightly modified - BELOW SHOWN COMPONENTS AND GROUPS MAY NOT EXIST):
 * 
 *  /**
 *   * Creates a basicEnemy entity.
 *   *
 *   * @param world The world.
 *   * @return A basicEnemy entity.
 *   *\/
 *   
 *   public static Entity createBasicEnemy(World world){
 *   	Entity enemy = world.createEntity();
 *		world.getManager(GroupManager.class).add(enemy, "ENEMIES");
 *		world.getManager(GroupManager.class).add(enemy, "MOVINGENTITIES");
 *		world.getManager(GroupManager.class).add(enemy, "CIRCLESHAPES");
 *	
 *		enemy.addComponent(new Transform(xPos, yPos));
 *		enemy.addComponent(new Velocity());
 *		enemy.addComponent(new Size(64,64));
 *		enemy.addComponent(new Friction(0.7f));
 *		enemy.addComponent(new Acceleration(10));
 *		enemy.addComponent(new Spatial("enemy.png"));
 *		return enemy;
 *   }
 */
public class EnemyEntityFactory {
	
}
