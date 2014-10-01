package com.designPatterns.builderPattern.builder;

import com.designPatterns.builderPattern.product.Car;

/**
 * The {@link ICarBuilder} interface.
 * <p>
 * This interface class defines all the
 * options that are available to build a 
 * car product. The getter methods in this
 * interface only return what was provided
 * to the builder.
 * <p> 
 * @author szeyick
 */
public interface ICarBuilder {

	/**
	 * Set the number of seats for the car.
	 * @param numberOfSeats - The number of seats.
	 */
	void setNumberOfSeats(int numberOfSeats);
	
	/**
	 * @return - The number of seats to add to the car.
	 */
	int getNumberOfSeats();
	
	/**
	 * Set whether the car has air conditioning.
	 * @param hasAirConditioning - <code>true</code> if
	 * the car has air conditioning, <code>false</code> otherwise.
	 */
	void setAirConditioning(boolean hasAirConditioning);
	
	/**
	 * @return <code>true</code> if the car has air conditioning,
	 * <code>false</code> otherwise.
	 */
	boolean getAirConditioning();
	
	/**
	 * Add GPS functionality to the car.
	 */
	void setGps(boolean hasGps);
	
	/**
	 * @return - <code>true</code> if the car is to have GPS, <code>false</code>
	 * otherwise.
	 */
	boolean getGps();
	
	/**
	 * @return - A built instance of the car with the
	 * options set.
	 */
	Car buildCar();
}
