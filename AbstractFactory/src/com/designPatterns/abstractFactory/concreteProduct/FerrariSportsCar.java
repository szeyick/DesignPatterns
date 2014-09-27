package com.designPatterns.abstractFactory.concreteProduct;

import com.designPatterns.abstractFactory.interfaces.IAbstractSportsCar;

/**
 * The {@link FerrariSportsCar}.
 * <p>
 * The concrete implementation of the abstract product. 
 * <p>
 * @author szeyick
 */
public class FerrariSportsCar implements IAbstractSportsCar {

	/**
	 * The name of the manufacturer.
	 */
	private String manufacturerName;
	
	/**
	 * The top speed of the car.
	 */
	private int numberOfGears;
	
	/**
	 * The price of the car.
	 */
	private int price;
	
	/**
	 * Constructor.
	 * @param manufacturerName - The manufacturer of the car.
	 * @param numberOfGears - The number of gears the car has.
	 * @param price - The price of the car.
	 */
	public FerrariSportsCar(String manufacturerName, int numberOfGears, int price) {
		this.manufacturerName = manufacturerName;
		this.numberOfGears = numberOfGears;
		this.price = price;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getNumberOfGears() {
		return numberOfGears;
	}

}
