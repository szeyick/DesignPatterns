package com.designPatterns.abstractFactory;

import com.designPatterns.abstractFactory.concreteFactory.FerrariFactory;
import com.designPatterns.abstractFactory.concreteFactory.MercedesFactory;
import com.designPatterns.abstractFactory.concreteFactory.RedBullFactory;
import com.designPatterns.abstractFactory.interfaces.IAbstractCarFactory;
import com.designPatterns.abstractFactory.interfaces.IAbstractFormula1Car;
import com.designPatterns.abstractFactory.interfaces.IAbstractPrototypeRaceCar;
import com.designPatterns.abstractFactory.interfaces.IAbstractSportsCar;

/**
 * The {@link AbstractFactoryPatternMain}.
 * <p>
 * This class is a runnable that demonstrates
 * the functionality behind a abstract factory.
 * <p>
 * The method printDetails demonstrates how an abstract
 * factory can be interchanged and different product
 * objects be created by only calling the abstract factory
 * interfaces.
 * <p>
 * @author szeyick
 */
public class AbstractFactoryPatternMain {

	/**
	 * Program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		IAbstractCarFactory ferrariFactory = FerrariFactory.createFactory();
		IAbstractCarFactory mercedesFactory = MercedesFactory.createFactory();
		IAbstractCarFactory redBullFactory = RedBullFactory.createFactory();
		
		printDetails(ferrariFactory);
		printDetails(mercedesFactory);
		printDetails(redBullFactory);
	}
	
	/**
	 * Print the details of cars produced at the provided factory.
	 * @param carFactory - The car factory.
	 */
	private static void printDetails(IAbstractCarFactory carFactory) {
		IAbstractFormula1Car formulaOneCar = carFactory.buildFormulaOneCar();
		System.out.println("Car Manufacturer: " + formulaOneCar.getManufacturerName());
		System.out.println("Car Model Number: " + formulaOneCar.getModelNumber());
		System.out.println("Car Manufactured Year: " + formulaOneCar.getManufacturedYear());
		
		System.out.println();
		
		IAbstractPrototypeRaceCar prototypeCar = carFactory.buildPrototypeRaceCar();
		System.out.println("Car Manufacturer: " + prototypeCar.getManufacturerName());
		System.out.println("Car Designation Number: " + prototypeCar.getPrototypeDesigation());
		System.out.println("Car Top Speed: " + prototypeCar.getTopSpeed());
		
		System.out.println();
		
		IAbstractSportsCar sportsCar = carFactory.buildSportsCar();
		System.out.println("Car Manufacturer: " + sportsCar.getManufacturerName());
		System.out.println("Car Price: $" + sportsCar.getPrice());
		System.out.println("Car Number of Gears: " + sportsCar.getNumberOfGears());
		
		System.out.println();
	}
}
