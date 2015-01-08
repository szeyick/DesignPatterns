package com.designPatterns.flyweightPattern;

import com.designPatterns.flyweightPattern.flyweight.Car;
import com.designPatterns.flyweightPattern.flyweight.CarFactory;

/**
 * The {@link FlyweightPatternMain}.
 * <p>
 * This class represents the client class which
 * will ask the FlyweightFactory {@link CarFactory}
 * to provide it with instances of the flyweight object
 * {@link Car}. The flyweight object is re-used if the 
 * factory already has an instance of it, otherwise it is
 * re-created.
 * <p>
 * @author szeyick
 */
public class FlyweightPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		
		// Create a car.
		Car car = carFactory.requestCar("Ferrari 430");
		car.setColour("Blue");
		car.printCarInfo();
		System.out.println();
		
		// Create another car.
		Car anotherCar = carFactory.requestCar("Ferrari 430");
		anotherCar.setColour("Red");
		anotherCar.printCarInfo();
		
		System.out.println();
		
		// Compare the cars - it should be the same object.
		if (car.equals(anotherCar)) {
			System.out.println("The same car object, different colours");
			System.out.println();
		}
		
		// Create another car.
		Car aCompletelyDifferentCar = carFactory.requestCar("Lamborghini Aventador");
		aCompletelyDifferentCar.setColour("Sunfire Orange");
		aCompletelyDifferentCar.printCarInfo();
		System.out.println();
		
		// Compare the cars.
		if (!car.equals(aCompletelyDifferentCar)) {
			System.out.println("Different car objects, different cars...");
		}
	}
}
