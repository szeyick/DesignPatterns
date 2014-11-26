package com.designPatterns.singletonPattern.singletonRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * The {@link SingletonRegistry}
 * <p>
 * This class allows for singletons objects to be
 * registered and accessed from a single location. 
 * <p>
 * The registry maintains key/value pairs for singletons
 * where clients can access through a known key. The singletons
 * are created by the registry on behalf of the caller and stored
 * in the registry to be re-called. The way that the singletons are
 * created does not stop the client from creating instances on their 
 * own.
 * <p>
 * @author szeyick
 */
public class SingletonRegistry {

	/**
	 * A map containing the collection of singletons registered.
	 */
	private static Map<String, ISingleton> singletons = new HashMap<String, ISingleton>();
	
	/**
	 * The singleton registry instance.
	 */
	private static SingletonRegistry registry;
	
	/**
	 * Private constructor to initialise the registry.
	 */
	private SingletonRegistry() {
		// Nothing to do.
	}
	
	/**
	 * @return - An instance of the registry.
	 */
	public static SingletonRegistry getInstance() {
		if (registry == null) {
			registry = new SingletonRegistry();
		}
		return registry;
	}
	
	/**
	 * @param singletonClass - The singleton to return.
	 * @return - An instance of the singleton, null otherwise.
	 */
	public ISingleton getSingleton(String singletonClass) {
		ISingleton singleton = singletons.get(singletonClass);
		if (singleton == null) {
			try {
				// If no singleton found we can create one and return
				singleton = (ISingleton) Class.forName(singletonClass).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			singletons.put(singletonClass, singleton);
		}
		return singletons.get(singletonClass);
	}
	
	/**
	 * Register a singleton with the registry to avoid using the full class path
	 * location to create an instance.
	 * @param singletonName - The name to associate to the singleton.
	 * @param singleton - The instance of the singleton.
	 */
	public void registerSingleton(String singletonName, ISingleton singleton) {
		singletons.put(singletonName, singleton);
	}
}
