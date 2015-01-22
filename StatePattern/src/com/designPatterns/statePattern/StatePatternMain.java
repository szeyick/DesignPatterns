package com.designPatterns.statePattern;

import com.designPatterns.statePattern.context.Context;
import com.designPatterns.statePattern.state.AmberLight;
import com.designPatterns.statePattern.state.GreenLight;
import com.designPatterns.statePattern.state.ITrafficLightState;
import com.designPatterns.statePattern.state.RedLight;

/**
 * The {@link StatePatternMain}
 * <p>
 * This is the program main for the State Pattern. It
 * creates the context and the state subclasses for a 
 * traffic light control. In this example, we can change
 * the state of the context, that will alter its behaviour
 * as the context invokes the state.
 * <p> 
 * @author szeyick
 */
public class StatePatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Create the initial context.
		Context context = new Context();
		
		// Create the state objects.
		ITrafficLightState redLight = new RedLight();
		ITrafficLightState greenLight = new GreenLight();
		ITrafficLightState amberLight = new AmberLight();
		
		// Set different states.
		redLight.changeLight(context);
		context.getState().showLight();
		
		greenLight.changeLight(context);
		context.getState().showLight();
		
		amberLight.changeLight(context);
		context.getState().showLight();
	}
}
