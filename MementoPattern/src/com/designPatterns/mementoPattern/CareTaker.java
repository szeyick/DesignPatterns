package com.designPatterns.mementoPattern;

import java.util.HashMap;
import java.util.Map;

import com.designPatterns.mementoPattern.memento.Memento;

/**
 * The {@link CareTaker}.
 * <p>
 * This class is responsible for managing the memento's. It functions a 
 * bank for memento's where we can store/retrieve memento's for a particular
 * object.
 * <p>
 * Only the originator that created the memento can retrieve it caretaker, which means
 * that when we create our originators, we need to assign it with a unique key. For 
 * simplicity, we will assign String's as the unique identifiers that are assigned to
 * each originator when they are created.
 * <p>
 * @author szeyick
 */
public class CareTaker {

	/**
	 * A collection of memento's stored in a map, the key represents
	 * the unique ID of the originator, and the value being its memento.
	 * <p>
	 * Its purpose is to ensure that only the originator of the memento can
	 * retrieve it.
	 */
	private Map<String, Memento> mementoMap;
	
	/**
	 * Constructor.
	 */
	public CareTaker() {
		mementoMap = new HashMap<String, Memento>();
	}
	
	/**
	 * Add a memento to the caretaker.
	 * @param originatorKey - The unique key provided by the originator.
	 * @param memento - The memento of the originator.
	 */
	public void addMemento(String originatorKey, Memento memento) {
		mementoMap.put(originatorKey, memento);
	}
	
	/**
	 * Retrieve a memento of a given key.
	 * @param originatorKey - The key provided by the originator.
	 * @return the matching memento for the originator, null otherwise. 
	 * We remove the memento as we retrieve it as the state should be restored.
	 */
	public Memento getMemento(String originatorKey) {
		return mementoMap.remove(originatorKey);
	}
}
