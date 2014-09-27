package com.designPatterns.abstractFactory.concreteProduct;

import com.designPatterns.abstractFactory.interfaces.IAbstractPrototypeRaceCar;

/**
 * The {@link FerrariPrototypeRaceCar}
 * <p>
 * The concrete implementation of the abstract product. 
 * <p>
 * @author szeyick
 */
public class FerrariPrototypeRaceCar implements IAbstractPrototypeRaceCar {

	/**
	 * The prototype designation of the car.
	 */
	private String prototypeDesignation;
	
	/**
	 * The top speed of the car.
	 */
	private int topSpeed;
	
	/**
	 * The name of the manufacturer.
	 */
	private String manufacturerName;
	
	/**
	 * Constructor.
	 * @param designation - The designation.
	 * @param topSpeed - The top speed.
	 * @param manufacturerName - The manufacturer.
	 */
	public FerrariPrototypeRaceCar(String designation, int topSpeed, String manufacturerName) {
		this.prototypeDesignation = designation;
		this.topSpeed = topSpeed;
		this.manufacturerName = manufacturerName;
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPrototypeDesigation() {
		return prototypeDesignation;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getTopSpeed() {
		return topSpeed;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getManufacturerName() {
		return manufacturerName;
	}
}
