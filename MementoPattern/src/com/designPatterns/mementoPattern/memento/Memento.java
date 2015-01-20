package com.designPatterns.mementoPattern.memento;

/**
 * The {@link Memento}
 * <p>
 * This class functions as its namesake in the pattern. It
 * is used to store the current state of the originator object
 * when we request it to save.
 * <p>
 * Only the originator of the memento should access it's internals.
 * <p>
 * @author szeyick
 */
public class Memento {

	/**
	 * The current t-shirt colour. This represents the state
	 * we want to save/restore.
	 */
	private String tShirtColour;
	
	/**
	 * Constructor.
	 * @param tShirtColourTmp - The colour of the shirt we want
	 * to save.
	 */
	public Memento(String tShirtColourTmp) {
		tShirtColour = tShirtColourTmp;
	}
	
	/**
	 * @return - The colour (state) of the t-shirt.
	 */
	public String getTShirtColour() {
		return tShirtColour;
	}
}
