package se.tactical;
import se.tactical.screens.GameScreen;

import com.badlogic.gdx.Game;

/**
 * TODONORM: Javadoc 
 *
 */
public class Tactical extends Game{
	
		private GameScreen gameScreen;
	
	@Override
	public void create() {		
		
		gameScreen = new GameScreen(); 
		
		setScreen(gameScreen);
	}

}
