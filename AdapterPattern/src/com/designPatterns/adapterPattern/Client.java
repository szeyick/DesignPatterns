package com.designPatterns.adapterPattern;

import com.designPatterns.adapterPattern.adaptee.PhoneCharger;
import com.designPatterns.adapterPattern.adaptee.adapter.IPowerAdapter;
import com.designPatterns.adapterPattern.adaptee.types.Countries;

/**
 * The {@link Client}
 * <p>
 * This class represents the client. In this instance
 * the client creates adaptees and depending on the country
 * of travel, the adaptee will use the adapter to ensure
 * that the device works with the wall socket.
 * <p>
 * @author szeyick
 */
public class Client {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		IPowerAdapter phoneCharger = new PhoneCharger(Countries.AUSTRALIA);
		
		phoneCharger.plugInDevice("iPhone", Countries.AUSTRALIA);
		phoneCharger.plugInDevice("iPad", Countries.UNITED_STATES);
		phoneCharger.plugInDevice("Macbook", Countries.LONDON);
	}
}
