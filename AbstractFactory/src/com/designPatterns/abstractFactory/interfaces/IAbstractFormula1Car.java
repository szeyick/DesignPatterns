package com.designPatterns.abstractFactory.interfaces;

/**
 * The {@link IAbstractFormula1Car}
 * <p>
 * This is the abstract product interface.
 * Concrete factories will create product objects
 * of this type to return to the client. The class that
 * implements this interface is only known to the 
 * concrete factory. The client will only know about the
 * product object through this interface.
 * <p>
 * @author szeyick
 */
public interface IAbstractFormula1Car {

	/**
	 * @return - The model number of the car.
	 */
	String getModelNumber();
	
	/**
	 * @return - The year the car was made.
	 */
	int getManufacturedYear();
	
	/**
	 * @return - The name of the manufacturer.
	 */
	String getManufacturerName();
}
