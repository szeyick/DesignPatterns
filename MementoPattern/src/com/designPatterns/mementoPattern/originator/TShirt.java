package com.designPatterns.mementoPattern.originator;

import com.designPatterns.mementoPattern.memento.Memento;

/**
 * The {@link TShirt}.
 * <p>
 * This class represents the originator in the memento
 * pattern. It stores information about our t-shirt and
 * also creates the memento to save the existing state of
 * the class when requested by the caretaker.
 * <p>
 * Only the originator classes create the memento.
 * <p>
 * @author szeyick
 */
public class TShirt {

	/**
	 * The colour (state) of the t-shirt.
	 */
	private String tShirtColour;
	
	/**
	 * The unique key of the TShirt instance.
	 */
	private String key;
	
	/**
	 * Constructor.
	 * @param key - The unique key for this instance of the originator.
	 * @param tShirtColourTmp - The colour of the tshirt.
	 */
	public TShirt(String keyTmp, String tShirtColourTmp) {
		key = keyTmp;
		tShirtColour = tShirtColourTmp;
	}
	
	/**
	 * Change the colour of the t-shirt.
	 * @param tShirtColourTmp - The colour of the t-shirt.
	 */
	public void setTShirtColour(String tShirtColourTmp) {
		tShirtColour = tShirtColourTmp;
	}
	
	/**
	 * @return - The current colour of the t-shirt.
	 */
	public String getTShirtColour() {
		return tShirtColour;
	}
	
	/**
	 * @return - The unique key for the tshirt.
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * @return - The current colour of the shirt in a 
	 * memento.
	 */
	public Memento saveTShirtColour() {
		return new Memento(tShirtColour);
	}
	
	/**
	 * Restore the previous colour of the t-shirt from
	 * our saved memento object. 
	 * @param memento - The memento to restore.
	 */
	public void restoreTShirtColour(Memento memento) {
		tShirtColour = memento.getTShirtColour();
	}
}
