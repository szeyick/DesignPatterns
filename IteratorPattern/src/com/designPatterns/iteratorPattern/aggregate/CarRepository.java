package com.designPatterns.iteratorPattern.aggregate;

import com.designPatterns.iteratorPattern.iterator.CarIterator;
import com.designPatterns.iteratorPattern.iterator.IIterator;

/**
 * The {@link CarRepository}
 * <p>
 * This repository class represents the concrete
 * implementation of the aggregate interface. It creates
 * the concrete iterator for the client.
 * <p> 
 * @author szeyick
 */
public class CarRepository implements IContainer {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IIterator getIterator() {
		return new CarIterator();
	}
}
