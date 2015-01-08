package com.designPatterns.flyweightPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@link CarFactory}
 * <p>
 * The car factory creates the {@link Car}. If
 * the requested car is not in the factory, the
 * factory will create one. 
 * <p>
 * The client provides the extrinsic data to customise
 * the created/provided object.
 * <p> 
 * @author szeyick
 */
public class CarFactory {

	/**
	 * The map of cars currently stored in the factory.
	 */
	private Map<String, Car> carMap;
	
	/**
	 * Constructor.
	 */
	public CarFactory() {
		carMap = new HashMap<String, Car>();
	}
	
	/**
	 * Ask the factory for a car.
	 * @param carModel - The type of car to request.
	 * @return - The requested car, a new car if it doesn't
	 * currently exist in the factory or a re-used one if it
	 * has been created previously.
	 */
	public Car requestCar(String carModel) {
		Car car = carMap.get(carModel);
		
		// Create a new car if it doesn't exist in the factory.
		if (car == null) {
			car = new Car(carModel);
			carMap.put(carModel, car);
			System.out.println("Creating a new car - " + carModel);
		}
		else {
			System.out.println("Providing you with a used - " + carModel);
		}
		return car;
	}
}
