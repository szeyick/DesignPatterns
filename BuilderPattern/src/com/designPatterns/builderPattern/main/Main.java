package com.designPatterns.builderPattern.main;

import com.designPatterns.builderPattern.builder.ConcreteCarBuilder;
import com.designPatterns.builderPattern.builder.ICarBuilder;
import com.designPatterns.builderPattern.product.Car;

/**
 * The projects {@link Main} class.
 * <p>
 * This class is the runnable program that 
 * demonstrates the builder pattern. The example
 * used in this program is the same as the one defined
 * in the readMe, where we will build a car product on
 * through the builder. The director in this instance will
 * be this class.
 * <p>
 * @author szeyick
 */
public class Main {
	
	/**
	 * The program entry point.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Create a new builder instance.
		ICarBuilder carBuilder = new ConcreteCarBuilder();
		printBuilderDetails(carBuilder);
		
		// Update the builder with the options for our new car.
		carBuilder.setAirConditioning(true);
		carBuilder.setGps(true);
		carBuilder.setNumberOfSeats(2);
		
		// Update details of our car build.
		printBuilderDetails(carBuilder);
		
		Car newCar = carBuilder.buildCar();
		printCarDetails(newCar);
	}
	
	/**
	 * Print the details of the car that have been provided to the
	 * builder.
	 */
	private static void printBuilderDetails(ICarBuilder carBuilder) {
		System.out.println("Details of your car -");
		System.out.println("Number of seats: " + carBuilder.getNumberOfSeats());
		System.out.println("Car has air conditioning: " + carBuilder.getAirConditioning());
		System.out.println("Car has a GPS: " + carBuilder.getGps());
		System.out.println("-------------------------");
	}
	
	/**
	 * Print the details of the car that has been built by the builder.
	 * @param car - The car returned by the builder.
	 */
	private static void printCarDetails(Car car) {
		System.out.println("Final details of your car -");
		System.out.println("Number of seats: " + car.getNumberOfSeats());
		System.out.println("Car has air conditioning: " + car.getAirConditioning());
		System.out.println("Car has a GPS: " + car.hasGps());
		System.out.println("-------------------------");
	}
}
