package com.designPatterns.decoratorPattern.component;

/**
 * The {@link Circle}
 * <p>
 * This class represents the concrete component in
 * the decorator pattern. Its main purpose is to simply
 * draw itself. Applying additional behaviours and properties
 * is the responsibility of the decorator and not this component
 * <p>
 * @author szeyick
 */
public class Circle implements IShape {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void draw() {
		System.out.print("Drawing a Circle...");
	}
}
