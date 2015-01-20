package com.designPatterns.mementoPattern;

import com.designPatterns.mementoPattern.originator.TShirt;

/**
 * The {@link MementoPatternMain}
 * <p>
 * This is the program main for the memento pattern. It will
 * create the originators and caretaker objects to demonstrate
 * the changing and restoring of states in the originator.
 * <p>
 * We ask the originator to create the memento objects for us, and
 * then store in the caretaker. We then change the state in the originator
 * and restore it with the memento from the caretaker.
 * <p>
 * @author szeyick
 */
public class MementoPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		
		TShirt tShirt1 = new TShirt("1", "Green");
		TShirt tShirt2 = new TShirt("2", "Blue");
		
		// Print the original colours (state) of the shirts
		System.out.println("Original Colour - " + tShirt1.getTShirtColour());
		System.out.println("Original Colour - " + tShirt2.getTShirtColour());
		System.out.println();
		
		// Save the state of the tshirts into our caretaker object.
		careTaker.addMemento(tShirt1.getKey(), tShirt1.saveTShirtColour());
		careTaker.addMemento(tShirt2.getKey(), tShirt2.saveTShirtColour());
		
		// Change the colours of the tshirt by modifying the originators.
		tShirt1.setTShirtColour("Orange");
		tShirt2.setTShirtColour("Pink");
		
		// Print the changed colours (state) of the shirts
		System.out.println("Modified Colour - " + tShirt1.getTShirtColour());
		System.out.println("Modified Colour - " + tShirt2.getTShirtColour());
		System.out.println();
		
		// Restore the colours of our t-shirts with the saved colours from the caretaker.
		tShirt1.restoreTShirtColour(careTaker.getMemento(tShirt1.getKey()));
		tShirt2.restoreTShirtColour(careTaker.getMemento(tShirt2.getKey()));
		
		// Print the original colours (state) of the shirts
		System.out.println("Original Colour - " + tShirt1.getTShirtColour());
		System.out.println("Original Colour - " + tShirt2.getTShirtColour());
		System.out.println();
	}
}
