package se.tactical.screens;

import se.tactical.entities.TerrainEntityFactory;
import se.tactical.systems.RenderSystem;

import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.GroupManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


/**
 * This class is the screen for the game 
 */
public class GameScreen implements Screen{
	
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private World world;
	private int boardWidth = 100;
	private int boardHeight = 100;

	public GameScreen(){
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, w, h);
		batch = new SpriteBatch();		
		world = new World();
		world.setManager(new GroupManager());
		world.setSystem(new RenderSystem(batch, camera, world));
		initializeTiles();
	}
	
	@Override
	public void render(float delta) {
		world.setDelta(delta);
		world.process();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	private void initializeTiles(){
		
		int size = 50;
		Texture texture = new Texture(Gdx.files.internal("gfx/tile.png"));
		TextureRegion region = new TextureRegion(texture, 0, 0, size, size);
		for(int i=0; i<boardWidth; i++){
			for(int j=0; j<boardHeight; j++){
				world.addEntity(TerrainEntityFactory.createBasicTerrain(world, i*size, j*size, size, region));
			}
		}
	}
	
}
