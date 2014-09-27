package com.designPatterns.abstractFactory.interfaces;

/**
 * The {@link IAbstractCarFactory}
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
 */
public interface IAbstractCarFactory {

	/**
	 * @return - A formula one car product object.
	 */
	IAbstractFormula1Car buildFormulaOneCar();
	
	/**
	 * @return - A prototype race car.
	 */
	IAbstractPrototypeRaceCar buildPrototypeRaceCar();
	
	/**
	 * @return - A sports car.
	 */
	IAbstractSportsCar buildSportsCar();
}
