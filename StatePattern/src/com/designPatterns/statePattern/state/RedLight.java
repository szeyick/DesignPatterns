package com.designPatterns.statePattern.state;

import com.designPatterns.statePattern.context.Context;

/**
 * The {@link RedLight}
 * <p>
 * This class represents the concrete state subclass. It
 * provides the specific behaviour to invoke if the context
 * selects this state.
 * <p>
 * @author szeyick
 */
public class RedLight implements ITrafficLightState {

	/**
	 * The colour of the traffic light in this state class.
	 */
	public static final String LIGHT_COLOUR = "Red";
	
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
		System.out.println("Stop...");
		System.out.println();
	}
}
