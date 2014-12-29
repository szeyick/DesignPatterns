package com.designPatterns.bridge.implementor;

/**
 * The {@link IDevice}.
 * <p>
 * This interface acts as the implementor bridge
 * between the abstract class and the concrete
 * implementor classes.
 * <p>
 * @author szeyick
 */
public interface IDevice {

	/**
	 * Switch the device on.
	 */
	public void turnDeviceOn();
	
	/**
	 * Switch the device off.
	 */
	public void turnDeviceOff();
}
