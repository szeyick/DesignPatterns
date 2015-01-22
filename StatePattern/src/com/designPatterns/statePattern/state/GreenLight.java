package com.designPatterns.statePattern.state;

import com.designPatterns.statePattern.context.Context;

/**
 * The {@link GreenLight}
 * <p>
 * This class represents the concrete state subclass. It
 * provides the specific behaviour to invoke if the context
 * selects this state.
 * <p>
 * @author szeyick
 */
public class GreenLight implements ITrafficLightState {

	/**
	 * The colour of the traffic light in this state class.
	 */
	public static final String LIGHT_COLOUR = "Green";
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void changeLight(Context context) {
		context.setState(this);
		System.out.println("Traffic light state changed - " + LIGHT_COLOUR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void showLight() {
		System.out.println("Go...");
		System.out.println();
	}
}
