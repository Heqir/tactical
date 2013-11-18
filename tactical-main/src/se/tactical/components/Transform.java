package se.tactical.components;

import com.artemis.Component;

public class Transform extends Component{

	private float x;
	private float y;
	private float direction;
	/**
	 * Creates a transform component with initial position 0,0 and direction 0
	 */
	public Transform() {
		this(0f, 0f, 0f);
	}
	/**
	 * Creates a transform component with the specified position and direction
	 * 
	 * @param x the x position
	 * @param y the y position
	 * @param direction the direction
	 */
	public Transform(float x, float y, float direction) {
		super();
		setPosition(x, y);
		setDirection(direction);
	}
	/**
	 * Sets the position
	 * @param x the x position
	 * @param y the y position
	 */
	public void setPosition(float x, float y){
		this.x=x;
		this.y=y;
	}
	/**
	 * Sets the direction
	 * @param direction the direction
	 */
	public void setDirection(float direction){
		this.direction=direction;
	}
	/**
	 * Returns the direction
	 * @return the direction
	 */
	public float getDirection(){
		return this.direction;
	}
	/**
	 * Returns the x position
	 * @return the x position
	 */
	public float getX(){
		return this.x;
	}
	/**
	 * Returns the y position
	 * @return the y position
	 */
	public float getY(){
		return this.y;
	}

}
