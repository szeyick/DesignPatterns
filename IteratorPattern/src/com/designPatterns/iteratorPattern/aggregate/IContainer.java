package com.designPatterns.iteratorPattern.aggregate;

import com.designPatterns.iteratorPattern.iterator.IIterator;

/**
 * The {@link IContainer}
 * <p>
 * This interface represents the aggregate
 * interface. It is used to provide the
 * iterator to the client.
 * <p>
 * @author szeyick
 */
public interface IContainer {

	/**
	 * @return - The iterator.
	 */
	public IIterator getIterator();
}
