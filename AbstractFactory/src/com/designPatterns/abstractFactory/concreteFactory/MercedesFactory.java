package com.designPatterns.abstractFactory.concreteFactory;

import com.designPatterns.abstractFactory.concreteProduct.MercedesFormulaOneCar;
import com.designPatterns.abstractFactory.concreteProduct.MercedesPrototypeRaceCar;
import com.designPatterns.abstractFactory.concreteProduct.MercedesSportsCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractCarFactory;
import com.designPatterns.abstractFactory.interfaces.IAbstractFormula1Car;
import com.designPatterns.abstractFactory.interfaces.IAbstractPrototypeRaceCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractSportsCar;

/**
 * The {@link MercedesFactory}.
 * <p>
 * The concrete implementation of the abstract factory. The
 * MercedesFactory factory will create the products (the different types
 * of cars) that will be returned to the client. Only the Mercedes
 * factory will know about the concrete implementation of the car.
 * <p>
 * @author szeyick
 */
public class MercedesFactory implements IAbstractCarFactory {

	/**
	 * The singleton instance of the factory.
	 */
	private static IAbstractCarFactory mercedesFactory;
	
	/**
	 * Private constructor.
	 */
	private MercedesFactory() {
		// Private constructor.
	}
	
	/**
	 * @return - The singleton instance of this class.
	 */
	public static IAbstractCarFactory createFactory() {
		if (mercedesFactory == null) {
			mercedesFactory = new MercedesFactory();
		}
		return mercedesFactory;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractFormula1Car buildFormulaOneCar() {
		return new MercedesFormulaOneCar("W-05", 2014, "Mercedes");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractPrototypeRaceCar buildPrototypeRaceCar() {
		return new MercedesPrototypeRaceCar("AMG SLS Z", 350, "Mercedes");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractSportsCar buildSportsCar() {
		return new MercedesSportsCar("Mercedes", 7, 80000);
	}
}
