package com.designPatterns.prototypePattern.prototype;

/**
 * The {@link Square}.
 * <p>
 * This class is an example of the Concrete
 * Prototype. The parent class implements
 * the cloneable interface allowing this child class
 * to implement only the methods.
 * <p>
 * @author szeyick
 */
public class Square extends Shape {

	/**
	 * Constructor.
	 */
	public Square() {
		type = "Square";
	}
}
