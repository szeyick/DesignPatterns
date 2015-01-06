package com.designPatterns.facadePattern.subSystem;

/**
 * The {@link IProgram}.
 * <p>
 * This interface acts as the common
 * interface that is shared between all
 * subsystem components.
 * <p>
 * @author szeyick
 */
public interface IProgram {

	/**
	 * @return - The name of the program.
	 */
	public String getProgramName();
	
	/**
	 * The action that will open the program.
	 */
	public void openProgram();
}
