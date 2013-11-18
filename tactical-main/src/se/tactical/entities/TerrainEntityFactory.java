package se.tactical.entities;

import se.tactical.components.Size;
import se.tactical.components.Spatial;
import se.tactical.components.Transform;

import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.GroupManager;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

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
 *   * Creates a basicTerrain entity.
 *   *
 *   * @param world The world.
 *   * @return A basicTerrain entity.
 *   *\/
 *   
 *   public static Entity createBasicTerrain(World world){
 *   	Entity terrain = world.createEntity();
 *		world.getManager(GroupManager.class).add(terrain, "TERRAIN");
 *		world.getManager(GroupManager.class).add(terrain, "STATICENTITIES");
 *	
 *		terrain.addComponent(new Transform(xPos, yPos));
 *		terrain.addComponent(new Size(64,64));
 *		terrain.addComponent(new Spatial("terrain.png"));
 *		return terrain;
 *   }
 */
public class TerrainEntityFactory {
	
	/** Creates a tile entity at the specified position with the specified size and TextureRegion and
	*  adds it to the groups "TERRAIN" and "STATICENTITIES".
	*
	*@param world The world.
	*@param xPos The x position.
	*@param yPos The y position.
	*@return A basicTerrain entity.
	*
	*/
	public static Entity createBasicTerrain(World world, float xPos, float yPos, float size, TextureRegion region){
		Entity terrain = world.createEntity();
		world.getManager(GroupManager.class).add(terrain, "TERRAIN");
		world.getManager(GroupManager.class).add(terrain, "STATICENTITIES");
		
		terrain.addComponent(new Transform(xPos, yPos, 0));
		terrain.addComponent(new Size(size,size));
		terrain.addComponent(new Spatial(region));
		return terrain;
	}
}
