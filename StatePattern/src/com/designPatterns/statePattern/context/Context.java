package com.designPatterns.statePattern.context;

import com.designPatterns.statePattern.state.ITrafficLightState;

/**
 * The {@link Context}.
 * <p>
 * @author szeyick
 *
 */
public class Context {

	/**
	 * The current state held by the context.
	 */
	private ITrafficLightState currentState;
	
	/**
	 * Constructor.
	 */
	public Context() {
		currentState = null;
	}
	
	/**
	 * Assign a new state to this context.
	 * @param state - The state for the context.
	 */
	public void setState(ITrafficLightState state) {
		currentState = state;
	}
	
	/**
	 * The state held by the context.
	 */
	public ITrafficLightState getState() {
		return currentState;
	}
}
