package com.designPatterns.decoratorPattern.component;

/**
 * The {@link IShape}
 * <p>
 * This interface acts as the Component in the pattern.
 * In the decorator pattern, this interface will be used
 * by both the concrete component and the decorator. The decorator
 * will mainly use this interface as a means of getting the method
 * calls to the component and passing it on.
 * <p>
 * @author szeyick
 */
public interface IShape {

	/**
	 * Draw the shape onto the screen.
	 */
	public void draw();
}
