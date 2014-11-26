package com.designPatterns.singletonPattern.singletonRegistry;

/**
 * The {@link AnotherSingletonRegistryObject}
 * <p>
 * This class represents a singleton that can be created
 * by the singleton registry. The client does not need to 
 * know about this class, only its string class name. 
 * <p>
 * In this instance, we no longer have a private constructor
 * nor static getter to retrieve the instance, but we rely
 * on the registry to create and return the single instance of
 * this object to the client.
 * <p>
 * @author szeyick
 */
public class AnotherSingletonRegistryObject implements ISingleton {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void printMessage() {
		System.out.println("I am called Another Singleton Registry Object!");
	}
}
