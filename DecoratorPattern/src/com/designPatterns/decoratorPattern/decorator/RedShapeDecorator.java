package com.designPatterns.decoratorPattern.decorator;

import com.designPatterns.decoratorPattern.component.IShape;

/**
 * The {@link RedShapeDecorator}
 * <p>
 * This class functions as the concrete decorator in the pattern.
 * Its purpose is to provide its custom behaviours or properties
 * to the component that it is to decorate. In this instance we are
 * colouring the component that this decorator holds in red.
 * <p>
 * @author szeyick
 */
public class RedShapeDecorator extends Decorator {

	/**
	 * Constructor.
	 * @param componentTmp - The component to decorate.
	 */
	public RedShapeDecorator(IShape componentTmp) {
		super(componentTmp);
	}

	/**
	 * Provide custom behaviours and properties before we
	 * pass on the drawing to the concrete component. 
	 */
	@Override
	public void draw() {
		component.draw();
		setRedBorder(component);
	}

	/**
	 * Provide a border to the component.
	 * @param component - The component to decorate.
	 */
	private void setRedBorder(IShape component) {
		// Ideally the properties would be set to the 
		// component rather than a print statement. 
		System.out.print("in border color: Red");
		System.out.println();
	}
}
