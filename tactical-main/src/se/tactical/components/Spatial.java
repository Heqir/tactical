package se.tactical.components;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
/**
 * 
 *  A component for storing a textureRegion
 */
public class Spatial extends Component{
	
	private TextureRegion region;
	/**
	 * Creates a spatial component
	 * @param region the region of the texture
	 */
	public Spatial(TextureRegion region){
		setRegion(region);
	}
	/**
	 * Returns the texture region
	 * @return the texture region
	 */
	public TextureRegion getTextureRegion(){
		return region;
	}
	/**
	 * Sets the texture region
	 * @param region the texture region to be set
	 */
	public void setRegion(TextureRegion region){
		this.region=region;
	}
	
	
}
