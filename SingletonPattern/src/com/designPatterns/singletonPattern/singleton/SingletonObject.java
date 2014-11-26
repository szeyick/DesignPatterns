package com.designPatterns.singletonPattern.singleton;

/**
 * The {@link SingletonObject}.
 * <p>
 * This class represents a singleton object.
 * <p>
 * Clients cannot directly create an instance of
 * this class but are required to get access through it
 * through the static instance method. This class is required
 * to create itself and to hold its own instance that will be
 * returned to the client when required.
 * <p>
 * @author szeyick
 */
public class SingletonObject {

	/**
	 * An instance of this class.
	 */
	private static SingletonObject instance;
	
	/**
	 * Private constructor to prevent outside
	 * calling to instantiate this object.
	 */
	private SingletonObject() {
		// Nothing to do.
	}
	
	/**
	 * @return - the instance of the object to the caller.
	 */
	public static SingletonObject getInstance() {
		if (instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	/**
	 * Print the message to show to the client.
	 */
	public void printMessage() {
		System.out.println("Hello I am a Singleton object!");
	}
}
