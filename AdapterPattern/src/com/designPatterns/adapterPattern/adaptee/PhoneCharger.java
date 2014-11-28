package com.designPatterns.adapterPattern.adaptee;

import com.designPatterns.adapterPattern.adaptee.adapter.IPowerAdapter;
import com.designPatterns.adapterPattern.adaptee.adapter.UnitedStatesAdapter;
import com.designPatterns.adapterPattern.adaptee.types.Countries;

/**
 * The {@link PhoneCharger}
 * <p>
 * This class represents the adaptee that
 * may need the adapter to convert to the 
 * required interface.
 * <p>
 * @author szeyick
 */
public class PhoneCharger implements IPowerAdapter {

	/**
	 * The country the charger is compatible with by default. 
	 */
	private Countries defaultCountry;
	
	/**
	 * The power adapter to use if we're in a different country
	 */
	private IPowerAdapter powerAdapter;
	
	/**
	 * Constructor.
	 */
	public PhoneCharger(Countries currentCountryTmp) {
		defaultCountry = currentCountryTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void plugInDevice(String device, Countries currentCountry) {
		if (defaultCountry.equals(currentCountry)) {
			System.out.println("Charging " + device + " in " + currentCountry.toString());
		}
		else if (Countries.UNITED_STATES.equals(currentCountry)) {
			powerAdapter = new UnitedStatesAdapter();
			powerAdapter.plugInDevice(device, currentCountry);
		}
		else {
			System.out.println("Device is incompatible in " + currentCountry);
		}
	}
}
