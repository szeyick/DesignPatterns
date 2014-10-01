package com.designPatterns.builderPattern.product;

import com.designPatterns.builderPattern.builder.ICarBuilder;

/**
 * The {@link Car}.
 * <p>
 * This car object represents the product in
 * the builder pattern. It is the responsibility
 * of the builder class to correctly construct this
 * product for the director on behalf of the client.
 * <p>
 * The main object constructor has been set to private
 * to prevent non-builder instances to construct this
 * object.
 * <p>
 * @author szeyick
 */
public class Car {

	/**
	 * The number of seats in the car.
	 */
	private int numberOfSeats;
	
	/**
	 * The state of the air conditioner in the car.
	 */
	private boolean hasAirConditioning;
	
	/**
	 * The state of the GPS in the car.
	 */
	private boolean hasGps;
	
	/**
	 * Private constructor to prevent non-builder
	 * classes from constructing this object.
	 */
	@SuppressWarnings("unused")
	private Car() {
		// Private constructor.
	}
	
	/**
	 * Constructor to build the car.
	 * @param builder - The builder containing all the
	 * required parameters to build the car.
	 */
	public Car(ICarBuilder builder) {
		numberOfSeats = builder.getNumberOfSeats();
		hasAirConditioning = builder.getAirConditioning();
		hasGps = builder.getGps();
	}
	
	/**
	 * @return - The number of seats in the car.
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	/**
	 * @return - <code>true</code> if the car is to have
	 * air conditioning, <code>false</code> otherwise.
	 */
	public boolean getAirConditioning() {
		return hasAirConditioning;
	}
	
	/**
	 * @return - <code>true</code> if the car is to have
	 * a GPS, <code>false</code> otherwise.
	 */
	public boolean hasGps() {
		return hasGps;
	}
}
