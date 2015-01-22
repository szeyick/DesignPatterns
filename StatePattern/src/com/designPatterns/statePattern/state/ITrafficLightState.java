package com.designPatterns.statePattern.state;

import com.designPatterns.statePattern.context.Context;

/**
 * The {@link ITrafficLightState}.
 * <p>
 * This interface functions as the State interface
 * in the pattern. It provides a behavioural action
 * that all subclasses must implement. 
 * <p>
 * The client accesses the various state objects through
 * this interface, and invokes the behaviour of that state
 * through the methods in the interface.
 * <p>
 * @author szeyick
 */
public interface ITrafficLightState {

	/**
	 * Change the colour of the light.
	 */
	public void changeLight(Context context);
	
	/**
	 * Show the light on the traffic light.
	 */
	public void showLight();
}
