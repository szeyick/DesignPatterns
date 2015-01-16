package com.designPatterns.iteratorPattern;

import com.designPatterns.iteratorPattern.aggregate.CarRepository;
import com.designPatterns.iteratorPattern.aggregate.IContainer;
import com.designPatterns.iteratorPattern.iterator.IIterator;

/**
 * The {@link IteratorPatternMain}
 * <p>
 * This class represents the cleint class in the
 * iterator pattern. We create the CarRepository 
 * (Concrete Aggregate) to provide us with the 
 * iterator. It is the iterator object that we 
 * receive back that we iterate through to
 * access the list (aggregate).
 * <p>
 * @author szeyick
 */
public class IteratorPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		IContainer carRepository = new CarRepository();
		IIterator iterator = carRepository.getIterator();
		
		// Traverse the iterator to access the aggregate objects.
		while (iterator.hasNext()) {
			System.out.println("Car - " + iterator.next());
		}
	}

}
