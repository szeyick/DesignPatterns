package com.designPatterns.iteratorPattern.iterator;

/**
 * The {@link CarIterator}
 * <p>
 * This iterator class represents the concrete
 * iterator. It iterates through the aggregate
 * object without having the aggregate object
 * doing it.
 * <p>
 * @author szeyick
 */
public class CarIterator implements IIterator {

	/**
	 * The aggregate that we are going to traverse
	 * through. This could be passed in from an external
	 * source if we wish to provide different aggregate
	 * objects.
	 */
	public String carsList[] = {"Ferrari", "BMW", "Mercedes", "McLaren", "Lamborghini"};
	
	/**
	 * The current index that the traversal is up to.
	 */
	private int currentIndex;
	
	/**
	 * Constructor.
	 */
	public CarIterator() {
		currentIndex = 0;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean hasNext() {
		if (currentIndex < carsList.length) {
			return true;
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object next() {
		if (hasNext()) {
			// Return the current item and increment the index.
			return carsList[currentIndex++];
		}
		return null;
	}

}
