package com.designPatterns.proxyPattern.proxy;

/**
 * The {@link ProxyPhone}.
 * <p>
 * This class functions as the proxy. To the shop
 * owner, it looks no different to the real thing.
 * <p>
 * When a customer comes into the shop to purchase a
 * phone, it is then that we actually make the phone
 * and return it to the shop.
 * <p>
 * @author szeyick
 */
public class ProxyPhone implements IPhone {

	/**
	 * The model of the phone.
	 */
	private String phoneModel;
	
	/**
	 * The actual phone to create.
	 */
	private Phone phone;
	
	/**
	 * Constructor
	 * @param phoneModelTmp - The model of the phone.
	 */
	public ProxyPhone(String phoneModelTmp) {
		phoneModel = phoneModelTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void purchaseDevice() {
		if (phone == null) {
			phone = new Phone(phoneModel);
		}
		phone.purchaseDevice();
	}

}
