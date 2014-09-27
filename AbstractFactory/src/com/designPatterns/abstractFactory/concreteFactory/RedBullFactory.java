package com.designPatterns.abstractFactory.concreteFactory;

import com.designPatterns.abstractFactory.concreteProduct.RedBullFormulaOneCar;
import com.designPatterns.abstractFactory.concreteProduct.RedBullPrototypeRaceCar;
import com.designPatterns.abstractFactory.concreteProduct.RedBullSportsCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractCarFactory;
import com.designPatterns.abstractFactory.interfaces.IAbstractFormula1Car;
import com.designPatterns.abstractFactory.interfaces.IAbstractPrototypeRaceCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractSportsCar;

/**
 * The {@link RedBullFactory}.
 * <p>
 * The concrete implementation of the abstract factory. The
 * RedBullFactory factory will create the products (the different types
 * of cars) that will be returned to the client. Only the Red Bull
 * factory will know about the concrete implementation of the car.
 * <p>
 * @author szeyick
 */
public class RedBullFactory implements IAbstractCarFactory {

	/**
	 * The singleton instance of the factory.
	 */
	private static IAbstractCarFactory redBullFactory;
	
	/**
	 * Private constructor.
	 */
	private RedBullFactory() {
		// Private constructor.
	}
	
	/**
	 * @return - The singleton instance of this class.
	 */
	public static IAbstractCarFactory createFactory() {
		if (redBullFactory == null) {
			redBullFactory = new RedBullFactory();
		}
		return redBullFactory;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractFormula1Car buildFormulaOneCar() {
		return new RedBullFormulaOneCar("RB-10", 2014, "Red Bull");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractPrototypeRaceCar buildPrototypeRaceCar() {
		return new RedBullPrototypeRaceCar("X-2014", 400, "Red Bull");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractSportsCar buildSportsCar() {
		return new RedBullSportsCar("Infiniti V35", 6, 50000);
	}

}
