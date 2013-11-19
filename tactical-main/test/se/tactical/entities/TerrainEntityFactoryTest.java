package se.tactical.entities;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import se.tactical.components.Size;
import se.tactical.components.Spatial;
import se.tactical.components.Transform;

import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.GroupManager;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TerrainEntityFactoryTest {

	@Test
	public void testCreateBasicTerrain() {
		
		World world;
		float xPos;
		float yPos;
		float size;
		GroupManager gm;
		
		world = new World();
		world.setManager(new GroupManager());
		ComponentMapper<Transform> transformMapper = world.getMapper(Transform.class);
		ComponentMapper<Size> sizeMapper = world.getMapper(Size.class); 
		ComponentMapper<Spatial> spatialMapper = world.getMapper(Spatial.class);
		
		
		gm = world.getManager(GroupManager.class);
		xPos = 0;
		yPos = 0;
		size = 0;
		
		TextureRegion region = new TextureRegion();
		
		
		Entity e = TerrainEntityFactory.createBasicTerrain (world,xPos, yPos, size, region);
		
		Transform t = transformMapper.get(e);
		
		assertTrue(t.getX()==0);
		assertTrue(t.getY()==0);
		
		Size s = sizeMapper.get(e);		
		assertTrue(s.getWidth()==0);
		assertTrue(s.getHeight()==0);
		
		Spatial spatial = spatialMapper.get(e);
		
		assertTrue(spatial!=null);
		
		assertTrue(gm.inInGroup(e, "TERRAIN"));
		assertTrue(gm.inInGroup(e, "STATICENTITIES"));
		
	}

}
