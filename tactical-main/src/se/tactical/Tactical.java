package se.tactical;
import se.tactical.screens.GameScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * TODONORM: Javadoc 
 *
 */
public class Tactical extends Game{
	
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private GameScreen gameScreen;
	
	@Override
	public void create() {		
		
		gameScreen = new GameScreen(); 
		
		setScreen(gameScreen);
	}

}
