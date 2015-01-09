package com.designPatterns.proxyPattern.proxy;

/**
 * The {@link Phone}.
 * <p>
 * This class functions as the realSubject. This is
 * the actual object that we want to create. The 
 * customer/client shouldn't be creating this class
 * directly as it should defer it to the proxy.
 * <p>
 * @author szeyick
 */
public class Phone implements IPhone {
	
	/**
	 * The name of the phone.
	 */
	private String phoneName;
	
	/**
	 * Constructor.
	 * @param phoneNameTmp - The name of the phone.
	 */
	public Phone(String phoneNameTmp) {
		phoneName = phoneNameTmp;
	}
	
	/**
	 * {@inheritDoc} 
	 */
	@Override
	public void purchaseDevice() {
		System.out.println("Congratulations...you have successfully purchase " + phoneName);
	}
}
