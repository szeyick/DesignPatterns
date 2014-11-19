package com.designPatterns.prototypePattern;

import com.designPatterns.prototypePattern.prototype.Shape;

/**
 * The {@link Client}.
 * <p>
 * In this example, the client creates new instances of
 * objects by asking the 
 * 
 * @author szeyick
 */
public class Client {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		ShapeCache shapeCache = new ShapeCache();
		shapeCache.loadCache();

		// The client asks the shape cache for the new object. 
		// The shape cache returns a cloned version of the object
		// that it originally created early when the cache was
		// initialised. 
		Shape clonedShape = (Shape) shapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());		

		Shape clonedShape2 = (Shape) shapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());		

		Shape clonedShape3 = (Shape) shapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
		
		Shape clonedShape4 = (Shape) shapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape4.getType());
		
		// Small test to check that the objects returned by
		// the cache are not the same.
		if (clonedShape.equals(clonedShape4)) {
			System.out.println("The shape objects are the same");
		}
	}
}
