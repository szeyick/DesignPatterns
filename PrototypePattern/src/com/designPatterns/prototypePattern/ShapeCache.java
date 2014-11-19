package com.designPatterns.prototypePattern;

import java.util.HashMap;
import java.util.Map;

import com.designPatterns.prototypePattern.prototype.Circle;
import com.designPatterns.prototypePattern.prototype.Rectangle;
import com.designPatterns.prototypePattern.prototype.Shape;
import com.designPatterns.prototypePattern.prototype.Square;

/**
 * The {@link ShapeCache}
 * <p>
 * This class creates all the Concrete Prototypes and
 * stores it in its internal cache. The {@link Client} when
 * required to create new objects will do so through this cache.
 * <p>
 * @author szeyick
 */
public class ShapeCache {

	/**
	 * The internal map containing the created
	 * shapes to clone.
	 */
	private Map<String, Shape> shapeCache;

	/**
	 * Constructor to initialise the cache.
	 */
	public ShapeCache() {
		shapeCache = new HashMap<String, Shape>();
	}

	/**
	 * @param shapeId - The idea of the shape to create.
	 * @return - A cloned instance of the shape.
	 */
	public Shape getShape(String shapeId) {
		Shape cachedShape = shapeCache.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	/**
	 * Create shape objects and store them in the 
	 * internal cache.
	 */
	public void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		
		Square square = new Square();
		square.setId("3");
		
		shapeCache.put(circle.getId(), circle);
		shapeCache.put(rectangle.getId(), rectangle);
		shapeCache.put(square.getId(), square);
	}

}
