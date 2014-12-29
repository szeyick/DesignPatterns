package com.designPatterns.bridge.abstraction;

import com.designPatterns.bridge.implementor.IDevice;

/**
 * The {@link ButtonSwitch}
 * <p>
 * This class represents the concrete implementation
 * of the abstract {@link Switch} class. This class
 * knows nothing of the implementor objects implementation
 * and only knows about their interface methods.
 * <p>
 * @author szeyick
 */
public class ButtonSwitch extends Switch {

	/**
	 * Switch toggle.
	 */
	private boolean isSwitchOn;
	
	/**
	 * Constructor
	 * @param deviceTmp - The device connected to this switch.
	 */
	public ButtonSwitch(IDevice deviceTmp) {
		super(deviceTmp);
		isSwitchOn = false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void flickSwitch() {
		// Toggle the switch on/off.
		if (isSwitchOn) {
			device.turnDeviceOff();
			isSwitchOn = false;
		}
		else {
			device.turnDeviceOn();
			isSwitchOn = true;
		}
	}
}
