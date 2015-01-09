package com.designPatterns.proxyPattern.proxy;

/**
 * The {@link IPhone}.
 * <p>
 * This is the common interface to be shared
 * between the Proxy and RealSubject. 
 * <p>
 * @author szeyick
 */
public interface IPhone {

	/**
	 * Method to purchase a phone.
	 * @return - The actual instance of the phone.
	 */
	public void purchaseDevice();
}
