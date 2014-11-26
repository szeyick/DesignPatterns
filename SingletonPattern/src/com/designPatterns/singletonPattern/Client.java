package com.designPatterns.singletonPattern;

import com.designPatterns.singletonPattern.singleton.SingletonObject;
import com.designPatterns.singletonPattern.singletonRegistry.AnotherSingletonRegistryObject;
import com.designPatterns.singletonPattern.singletonRegistry.ISingleton;
import com.designPatterns.singletonPattern.singletonRegistry.SingletonRegistry;

/**
 * The {@link Client}
 * <p>
 * This is the program main that is used to 
 * represent the client side code. The client
 * accessed the Singleton object through the Instance
 * method.
 * <p>
 * In addition, Singleton objects could also be retrieved
 * from a cache, providing a single point of access for
 * multiple singleton objects.
 * <p>
 * @author szeyick
 */
public class Client {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Retrieving a singleton object if the class manages its
		// own creation.
		SingletonObject singleton = SingletonObject.getInstance();
		singleton.printMessage();
		
		// If we have multiple singletons and we want to create a single
		// point of access, we can use a SingletonRegistry. The registry 
		// manages the creation and retrieval of singletons for the client.
		//
		// The downside to this is that we're required to use the fully qualified name
		// to the object we want to create it.
		ISingleton singletonObject = SingletonRegistry.getInstance().
				getSingleton("com.designPatterns.singletonPattern.singletonRegistry.SingletonRegistryObject");
		singletonObject.printMessage();
		
		// Alternatively we can have the client create the singleton and register it with
		// the registry. This will expose the singleton, however provides a neater way to retrieve.
		SingletonRegistry.getInstance().registerSingleton("AnotherSingletonRegistryObject", new AnotherSingletonRegistryObject());
	
		ISingleton anotherSingleton = SingletonRegistry.getInstance().getSingleton("AnotherSingletonRegistryObject");
		anotherSingleton.printMessage();
	}
}
