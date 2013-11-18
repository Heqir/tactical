package se.tactical.components;

import com.artemis.Component;

public class Size extends Component{
	
	private float width;
	private float height;
	/**
	 * Creates a size component with initial size of 0x0
	 */
	public Size(){
		this(0,0);
	}
	/**
	 * Creates a size component with the specified size
	 * @param width the width
	 * @param height the height
	 */
	public Size(float width, float height){
		setWidth(width);
		setHeight(height);
	}
	/**
	 * Sets the width 
	 * @param width the width
	 */
	public void setWidth(float width){
		this.width = width;
	}
	/**
	 * Sets the height
	 * @param height the height
	 */
	public void setHeight(float height){
		this.height = height;
	}
	/**
	 * Returns the width
	 * @return the width
	 */
	public float getWidth(){
		return this.width;
	}
	/**
	 * Returns the height
	 * @return the height
	 */
	public float getHeight(){
		return this.height;
	}
}
