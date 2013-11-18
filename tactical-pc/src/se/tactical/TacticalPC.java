package se.tactical;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;


public class TacticalPC {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Tactical";
		cfg.useGL20 = false;
		cfg.width = 1280;
		cfg.height = 720;
		
		new LwjglApplication(new Tactical(), cfg);
	}
}
