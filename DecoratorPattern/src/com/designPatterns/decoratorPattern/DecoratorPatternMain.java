package com.designPatterns.decoratorPattern;

import com.designPatterns.decoratorPattern.component.Circle;
import com.designPatterns.decoratorPattern.component.Square;
import com.designPatterns.decoratorPattern.decorator.RedShapeDecorator;

/**
 * The {@link DecoratorPatternMain}
 * <p>
 * This is the program main for demonstrating how
 * the decorator pattern functions. We use pass in the components
 * to the decorators so that they can be drawn with the additional
 * properties.
 * <p>
 * @author szeyick
 *
 */
public class DecoratorPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		Circle regularCircle = new Circle();
		RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		RedShapeDecorator redSquare = new RedShapeDecorator(new Square());

		// Draw a normal circle.
		regularCircle.draw();
		System.out.println();
		
		// Draw a red circle.
		redCircle.draw();
		
		// Draw a red square.
		redSquare.draw();
	}
}
