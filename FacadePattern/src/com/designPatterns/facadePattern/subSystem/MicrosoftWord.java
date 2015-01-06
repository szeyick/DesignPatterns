package com.designPatterns.facadePattern.subSystem;

/**
 * The {@link MicrosoftWord}.
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
public class MicrosoftWord implements IProgram {

	/**
	 * The name of the program.
	 */
	private static final String PROGRAM_NAME = "Microsoft Word";
	
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
		System.out.println("Opening Word Processor....");
		System.out.println("Time to do some work.....");
	}

}
