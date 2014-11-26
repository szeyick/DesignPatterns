package com.designPatterns.singletonPattern.singletonRegistry;

/**
 * The {@link ISingleton}.
 * <p>
 * This is a common interface to identify singletons
 * that can be created by the registry. 
 * <p>
 * @author szeyick
 */
public interface ISingleton {

	/**
	 * Print the message that the implementing
	 * interface needs to provide.
	 */
	public void printMessage();
}
