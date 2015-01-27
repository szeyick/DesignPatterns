package com.designPatterns.visitorPattern.visitor;

import com.designPatterns.visitorPattern.element.Dave;
import com.designPatterns.visitorPattern.element.Jerry;
import com.designPatterns.visitorPattern.element.Stuart;

/**
 * The {@link Visitor}
 * <p>
 * This class acts as the visitor in the pattern. Its
 * purpose is to extend the functionality of a external
 * class without touching the class directly.
 * <p>
 * In this attendance example, the visitor answers on 
 * behalf of the element class. To keep it simple we won't
 * access the element, but in the real world, the visitor
 * would have public access to the element. 
 * <p>
 * @author szeyick
 */
public class Visitor implements IVisitor {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(Stuart stuart) {
		System.out.println("Hello I'm Stuart...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(Jerry jerry) {
		System.out.println("Hello I'm Jerry...");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void visit(Dave dave) {
		System.out.println("Hello I'm Dave...");
	}
}
