package se.tactical.systems;

import se.tactical.components.Size;
import se.tactical.components.Spatial;
import se.tactical.components.Transform;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.systems.EntityProcessingSystem;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 *A system for rendering entities. 
 */

public class RenderSystem extends EntityProcessingSystem{
	
	private SpriteBatch batch;
	private Camera camera;
	private ComponentMapper<Spatial> spatialMapper;
	private ComponentMapper<Transform> transformMapper;
	private ComponentMapper<Size> sizeMapper;
	
	public RenderSystem(SpriteBatch batch, Camera camera) {
		 super(Aspect.getAspectForOne(Spatial.class));
	}
	
	
	@Override
	protected void initialize(){
		spatialMapper = world.getMapper(Spatial.class);
		transformMapper = world.getMapper(Transform.class);
		sizeMapper = world.getMapper(Size.class);
	}
	
	/**
	 * Called before processing of entities begins.
	 */
	@Override
    protected void begin() {
         batch.setProjectionMatrix(camera.combined);
         batch.begin();
       
    }
	
	/**
	 * Called after the processing of entities ends.
	 */
	@Override
	protected void end() {
         batch.end();
	}
	
	@Override
	protected void process(Entity e) {
		Spatial spatial = spatialMapper.get(e);
		Transform transform = transformMapper.get(e);
		Size size = sizeMapper.get(e);
		batch.draw(spatial.getTextureRegion(), transform.getX(), transform.getY(),size.getWidth(),size.getHeight());
		
	}

}
