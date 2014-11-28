package com.designPatterns.adapterPattern.adaptee.adapter;

import com.designPatterns.adapterPattern.adaptee.types.Countries;

/**
 * The {@link IPowerAdapter}.
 * <p>
 * This interface functions as the target
 * interface for the adapter.
 * <p>
 * @author szeyick
 */
public interface IPowerAdapter {

	/**
	 * @param device - The device to plug into the adapter.
	 * @param currentCountry - The current country we're in.
	 */
	void plugInDevice(String device, Countries currentCountry);
}
