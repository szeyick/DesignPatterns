package com.designPatterns.abstractFactory.interfaces;

/**
 * The {@link IAbstractPrototypeRaceCar}
 * <p>
 * This interface represents the abstract
 * factory component of the pattern. Concrete
 * factories are to implement this interface to
 * provide products to the client.
 * <p>
 * The products returned to the client are to
 * be of the abstract product type rather than the
 * concrete type since this would limit the type of
 * product objects that the factories can return.
 * <p>
 * @author szeyick
 *
 */
public interface IAbstractPrototypeRaceCar {

	/**
	 * @return - The prototype designation of the car.
	 */
	String getPrototypeDesigation();
	
	/**
	 * @return - The top speed of the car.
	 */
	int getTopSpeed();

	/**
	 * @return - The name of the manufacturer.
	 */
	String getManufacturerName();
}
