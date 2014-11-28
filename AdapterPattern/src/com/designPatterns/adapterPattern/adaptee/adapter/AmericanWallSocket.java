package com.designPatterns.adapterPattern.adaptee.adapter;

/**
 * The {@link AmericanWallSocket}
 * <p>
 * This class represents the concrete implementation
 * of the target interface that the adapter is to
 * convert to.
 * <p>
 * @author szeyick
 */
public class AmericanWallSocket implements IWallSocket {

	/**
	 * {@inheritDoc}}
	 */
	@Override
	public void chargeDevice(String deviceType) {
		System.out.println("Charging " + deviceType + " in American wall socket");
	}
}
