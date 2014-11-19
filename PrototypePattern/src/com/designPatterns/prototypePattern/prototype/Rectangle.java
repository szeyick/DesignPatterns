package com.designPatterns.prototypePattern.prototype;

/**
 * The {@link Rectangle}.
 * <p>
 * This class is an example of the Concrete
 * Prototype. The parent class implements
 * the cloneable interface allowing this child class
 * to implement only the methods.
 * <p>
 * @author szeyick
 */
public class Rectangle extends Shape {

	/**
	 * Constructor.
	 */
	public Rectangle() {
		type = "Rectangle";
	}
}
