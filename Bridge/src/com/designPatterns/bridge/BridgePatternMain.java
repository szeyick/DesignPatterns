package com.designPatterns.bridge;

import com.designPatterns.bridge.abstraction.ButtonSwitch;
import com.designPatterns.bridge.abstraction.Switch;
import com.designPatterns.bridge.implementor.Microwave;
import com.designPatterns.bridge.implementor.Television;

/**
 * The {@link BridgePatternMain}
 * <p>
 * This is the program main that creates all
 * the required implementor and abstract objects
 * that are used to demonstrate how the bridge pattern
 * functions.
 * <p>
 * @author szeyick
 */
public class BridgePatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		Switch buttonSwitch = new ButtonSwitch(new Microwave());
		buttonSwitch.flickSwitch();
		buttonSwitch.flickSwitch();
		
		// We can create another button switch but pass in a different
		// IDevice object and still call the same methods to flick the
		// switch on another device.
		Switch anotherButtonSwitch = new ButtonSwitch(new Television());
		anotherButtonSwitch.flickSwitch();
		anotherButtonSwitch.flickSwitch();
	}
}
