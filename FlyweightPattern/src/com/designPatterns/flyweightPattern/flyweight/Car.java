package com.designPatterns.flyweightPattern.flyweight;

/**
 * The {@link Car}
 * <p>
 * This car class represents the concrete
 * flyweight. It implements the {@link IVehicle}
 * interface and stores both the intrinsic and
 * extrinsic states. Extrinsic state is provided
 * by the client to configure the flyweight object.
 * <p>
 * It should be noted that the flyweight does not need
 * to provide intrinsic state should it not be required.
 * <p>
 * The colour of the car can be changed.
 * <p>
 * @author szeyick
 */
public class Car implements IVehicle {

	/**
	 * The colour of the car.
	 */
	private String colour;
	
	/**
	 * The model of the car.
	 */
	private String carModel;
	
	/**
	 * Constructor
	 * @param carModelTmp - The model of car.
	 */
	public Car(String carModelTmp) {
		carModel = carModelTmp;
	}
	
	/**
	 * Change the colour of the car.
	 * @param colourTmp - The colour to change.
	 */
	public void setColour(String colourTmp) {
		colour = colourTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printCarInfo() {
		System.out.println("You have just bought a " + carModel + " in the colour " + colour);
	}
}
