package com.designPatterns.abstractFactory.concreteFactory;

import com.designPatterns.abstractFactory.concreteProduct.FerrariFormulaOneCar;
import com.designPatterns.abstractFactory.concreteProduct.FerrariPrototypeRaceCar;
import com.designPatterns.abstractFactory.concreteProduct.FerrariSportsCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractCarFactory;
import com.designPatterns.abstractFactory.interfaces.IAbstractFormula1Car;
import com.designPatterns.abstractFactory.interfaces.IAbstractPrototypeRaceCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractSportsCar;

/**
 * The {@link FerrariFactory}.
 * <p>
 * The concerete implementation of the abstract factory. The
 * Ferrari factory will create the products (the different types
 * of cars) that will be returned to the client. Only the Ferrari
 * factory will know about the concrete implementation of the car.
 * <p>
 * @author szeyick
 */
public class FerrariFactory implements IAbstractCarFactory {

	/**
	 * The singleton instance of the factory.
	 */
	private static IAbstractCarFactory ferrariFactory;
	
	/**
	 * Private constructor.
	 */
	private FerrariFactory() {
		// Private constructor.
		super();
	}
	
	/**
	 * @return - The singleton instance of this class.
	 */
	public static IAbstractCarFactory createFactory() {
		if (ferrariFactory == null) {
			ferrariFactory = new FerrariFactory();
		}
		return ferrariFactory;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractFormula1Car buildFormulaOneCar() {
		return new FerrariFormulaOneCar("F14-T", 2014, "Ferrari");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractPrototypeRaceCar buildPrototypeRaceCar() {
		return new FerrariPrototypeRaceCar("FXX", 350, "Ferrari");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public IAbstractSportsCar buildSportsCar() {
		return new FerrariSportsCar("Ferrari", 7, 350000);
	}
}
