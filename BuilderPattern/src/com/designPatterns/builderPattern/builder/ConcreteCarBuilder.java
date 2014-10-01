package com.designPatterns.builderPattern.builder;

import com.designPatterns.builderPattern.product.Car;

/**
 * The {@link ConcreteCarBuilder}.
 * <p>
 * This concrete builder creates the car product on behalf
 * of the director. The builder contains default values to
 * set to the {@link Car} product if the build is called immediately.
 * 
 * This allows the product to be constructed without having to worry
 * about building an incomplete object.
 * <p>
 * @author szeyick
 */
public class ConcreteCarBuilder implements ICarBuilder {

	/**
	 * Default values for the number of seats in the car.
	 */
	private int numberOfSeats = 4;
	
	/**
	 * Default values for the cars GPS status.
	 */
	private boolean hasGps = false;
	
	/**
	 * Default values for the cars air conditioning status.
	 */
	private boolean hasAirConditioning = false;
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setAirConditioning(boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean getAirConditioning() {
		return hasAirConditioning;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setGps(boolean hasGps) {
		this.hasGps = hasGps;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean getGps() {
		return hasGps;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Car buildCar() {
		return new Car(this);
	}
}
