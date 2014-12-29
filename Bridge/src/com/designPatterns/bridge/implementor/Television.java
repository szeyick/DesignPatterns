package com.designPatterns.bridge.implementor;

/**
 * The {@link Television}
 * <p>
 * This class acts as the concrete implementation
 * of the {@link IDevice} implementor. The abstract
 * classes do not need to know about this object
 * or its implementation since it only refers to it through
 * its interface methods that are shared between the abstract
 * class and the concrete implementor.
 * <p>
 * @author szeyick
 */
public class Television implements IDevice {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnDeviceOn() {
		System.out.println("Turning television on");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnDeviceOff() {
		System.out.println("Turning television off");
	}

}
