package com.designPatterns.adapterPattern.adaptee.adapter;

import com.designPatterns.adapterPattern.adaptee.types.Countries;

/**
 * The {@link UnitedStatesAdapter}
 * <p>
 * This class functions as the adapter class. The adaptee
 * class uses the required adapter class to convert its
 * own attributes into a compatible type to use for this
 * interface.
 * <p>
 * @author szeyick
 */
public class UnitedStatesAdapter implements IPowerAdapter {

	/**
	 * The Unite States adapter uses the wall socket.
	 */
	private IWallSocket americanWallSocket;
	
	/**
	 * Constructor to use the correct adapter.
	 */
	public UnitedStatesAdapter() {
		americanWallSocket = new AmericanWallSocket();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void plugInDevice(String device, Countries currentCountry) {
		americanWallSocket.chargeDevice(device);
	}
}
