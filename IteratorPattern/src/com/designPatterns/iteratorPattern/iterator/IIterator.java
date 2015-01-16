package com.designPatterns.iteratorPattern.iterator;

/**
 * The {@link IIterator}
 * <p>
 * This interface provides client access to 
 * the concrete iterator which traverses the
 * aggregate object.
 * <p>
 * @author szeyick
 */
public interface IIterator {

	/**
	 * @return - <code>true</code> if there is a next
	 * item in the aggregate to go to, <code>false</code>
	 * otherwise.
	 * <p> 
	 * The there is a next element in the 
	 * aggregate (This means the iterator tracks where
	 * it is currently in the list).
	 */
	public boolean hasNext();
	
	/**
	 * @return - The next object the iterator has counted
	 * to. The returned object is from the aggregate object.
	 */
	public Object next();
}
