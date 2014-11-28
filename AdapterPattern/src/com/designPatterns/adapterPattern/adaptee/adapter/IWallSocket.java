package com.designPatterns.adapterPattern.adaptee.adapter;

/**
 * The {@link IWallSocket}
 * <p>
 * This interface acts as the target interface that
 * the adapter is to convert to.
 * <p>
 * @author szeyick
 */
public interface IWallSocket {

	/**
	 * Charge a device.
	 * @param deviceType - The device to charge.
	 */
	void chargeDevice(String deviceType);
}
