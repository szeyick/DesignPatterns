package com.designPatterns.flyweightPattern.flyweight;

/**
 * The {@link IVehicle}
 * <p>
 * This interface acts as the flyweight's
 * interface. Objects implementing this interface
 * can act as a flyweight and be managed by the 
 * flyweight factory. 
 * 
 * @author szeyick
 */
public interface IVehicle {

	/**
	 * Print the information about the car.
	 */
	void printCarInfo();
}
