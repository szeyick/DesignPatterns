package com.designPatterns.decoratorPattern.component;

/**
 * The {@link Square}.
 * <p>
 * This class represents the concrete component
 * of the decorator pattern. It draws itself but
 * does not do anything else. It is the responsibility
 * of the decorator to apply different behaviours to this
 * concrete component object.
 * <p>
 * @author szeyick
 */
public class Square implements IShape {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void draw() {
		System.out.print("Drawing a Square...");
	}
}
