package com.designPatterns.abstractFactory.concreteProduct;

import com.designPatterns.abstractFactory.interfaces.IAbstractFormula1Car;

/**
 * The {@link MercedesFormulaOneCar}
 * <p>
 * The concrete implementation of the abstract product. 
 * <p>
 * @author szeyick
 */
public class MercedesFormulaOneCar implements IAbstractFormula1Car {

	/**
	 * The model number of the car.
	 */
	private String modelNumber;
	
	/**
	 * The year the car was manufactured.
	 */
	private int manufacturedYear;
	
	/**
	 * The name of the manufacturer that produces the car.
	 */
	private String manufacturerName;
	
	/**
	 * Constructor.
	 * @param modelNumber - The model number of the car.
	 * @param manufacturedYear - The manufactured year of the car.
	 * @param manufacturerName - The name of the manufacturer.
	 * @return - An initialised instance of the car.
	 */
	public MercedesFormulaOneCar (String modelNumber, int manufacturedYear, String manufacturerName) {
		this.modelNumber = modelNumber;
		this.manufacturerName = manufacturerName;
		this.manufacturedYear = manufacturedYear;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getModelNumber() {
		return modelNumber;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getManufacturedYear() {
		return manufacturedYear;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getManufacturerName() {
		return manufacturerName;
	}
}
