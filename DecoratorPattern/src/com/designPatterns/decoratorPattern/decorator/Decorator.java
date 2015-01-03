package com.designPatterns.decoratorPattern.decorator;

import com.designPatterns.decoratorPattern.component.IShape;

/**
 * The {@link Decorator}
 * <p>
 * This decorator class functions as the decorator. It contains a
 * reference to the object that it is supposed to decorate. It implements
 * the same interface as the component that it is decorating, meaning that
 * when the {@link IShape} interface methods are called, it does whatever
 * decorations it needs to before passing the method call onto the concrete
 * component itself.
 * <p>
 * @author szeyick
 *
 */
public abstract class Decorator implements IShape {

	/**
	 * The component this decorator is to decorate.
	 */
	protected IShape component;
	
	/**
	 * Constructor.
	 * @param componentTmp - The component to decorate.
	 */
	public Decorator(IShape componentTmp) {
		component = componentTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void draw() {
		component.draw();
	}
}
