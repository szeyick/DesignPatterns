package com.designPatterns.bridge.abstraction;

import com.designPatterns.bridge.implementor.IDevice;

/**
 * The {@link Switch}.
 * <p>
 * This abstract class represents the class that uses
 * the {@link IDevice} interface. It only knows about the
 * concrete implementation of the {@link IDevice} objects
 * through its interface. 
 * <p>
 * This means that we are free to extend this abstract class
 * or the {@link IDevice} interface without affecting other
 * classes other than their concrete implementing child classes.
 * <p>
 * This abstract class contains a reference to the {@link IDevice}
 * and does not implement any of its methods.
 * <p>
 * @author szeyick
 */
public abstract class Switch {
	
	/**
	 * The device that this switch class
	 * controls.
	 */
	protected IDevice device;
	
	/**
	 * Abstract Constructor.
	 * @param deviceTmp - The device to assign to the
	 * switch.
	 */
	protected Switch(IDevice deviceTmp) {
		device = deviceTmp;
	}
	
	/**
	 * Abstract method that the child classes need to
	 * implement.
	 */
	public abstract void flickSwitch();
}
