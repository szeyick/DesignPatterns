package com.designPatterns.bridge.implementor;

/**
 * The {@link Microwave}.
 * <p>
 * This class acts as the concrete implementation of
 * the {@link IDevice} implementor. It implements the
 * methods of the interface, that can be called by the
 * abstract class.
 * <p>
 * @author szeyick
 */
public class Microwave implements IDevice {
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnDeviceOn() {
		System.out.println("Turning microwave on");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnDeviceOff() {
		System.out.println("Turning microwave off");
	}

}
