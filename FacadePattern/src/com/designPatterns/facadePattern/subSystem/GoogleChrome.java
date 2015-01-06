package com.designPatterns.facadePattern.subSystem;

/**
 * The {@link GoogleChrome}.
 * <p>
 * This class functions as a subsystem
 * component. To reduce the complexity
 * and dependencies between components
 * and the client, the facade will be the
 * class that holds references to these 
 * {@link IProgram} objects.
 * <p>
 * @author szeyick
 */
public class GoogleChrome implements IProgram {

	/**
	 * The name of the program.
	 */
	private static final String PROGRAM_NAME = "Google Chrome";
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getProgramName() {
		return PROGRAM_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void openProgram() {
		System.out.println("Opening Web Browser - " + PROGRAM_NAME);
		System.out.println("Accessing Internet.............");
	}
}
