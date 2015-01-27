package com.designPatterns.visitorPattern;

import com.designPatterns.visitorPattern.element.Dave;
import com.designPatterns.visitorPattern.element.Jerry;
import com.designPatterns.visitorPattern.element.Stuart;
import com.designPatterns.visitorPattern.visitor.Visitor;

/**
 * The {@link VisitorPattern}.
 * <p>
 * This class functions as the project main for
 * demonstrating the visitor pattern.
 * <p>
 * @author szeyick
 */
public class VisitorPatternMain {

	/**
	 * The program main.
	 * @param args - The command line arguments.
	 */
	public static void main(String[] args) {
		// Create the visitor.
		Visitor visitor = new Visitor();
		
		// Create all the concrete elements.
		Dave dave = new Dave();
		Jerry jerry = new Jerry();
		Stuart stuart = new Stuart();
		
		// Pass the visitor to the element so the visitor
		// can process methods on behalf of the element.
		dave.accept(visitor);
		jerry.accept(visitor);
		stuart.accept(visitor);
	}
}
