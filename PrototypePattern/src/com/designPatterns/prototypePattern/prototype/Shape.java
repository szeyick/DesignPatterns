package com.designPatterns.prototypePattern.prototype;

/**
 * The {@link Shape}.
 * <p>
 * This class represents the interface that will be
 * implemented by the Concrete Prototypes. The important
 * thing to take from this class is the implementation of
 * the Cloneable method that allows objects to be cloned
 * rather than completely re-created.
 * <p>
 * @author szeyick
 */
public abstract class Shape implements Cloneable {

	/**
	 * The id to identify the shape.
	 */
	private String id;
	
	/**
	 * The shape type.
	 */
	protected String type;

	/**
	 * Draw method for subclasses to implement.
	 */
	public void draw() {
		System.out.println("I am a " + type);
	}

	/**
	 * @return - The type of the shape.
	 */
	public String getType(){
		return type;
	}

	/**
	 * @return - The id of the shape.
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id - The id to assign to the shape.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The clone method allows subclasses to clone themselves.
	 * If an object cannot be cloned it'll throw an exception.
	 */
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
