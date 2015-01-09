package com.designPatterns.proxyPattern;

import com.designPatterns.proxyPattern.proxy.IPhone;
import com.designPatterns.proxyPattern.proxy.ProxyPhone;

/**
 * The {@link ProxyPattern}.
 * <p>
 * This class represents the program main and 
 * doubles as the client. In this example the
 * client is the shop owner and uses the proxy
 * (fake) phones. It is only when a customer comes
 * in to purchase a real phone that we ask the
 * proxy to provide us with the real one.
 * <p>
 * @author szeyick
 */
public class ProxyPatternMain {
	
	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		IPhone phone = new ProxyPhone("OnePlus One");
		
		// Purchase new phone.
		phone.purchaseDevice();
		System.out.println("");
		
		// Purchase another phone, it will be the same.
		phone.purchaseDevice();
	}
}
