package com.designPatterns.visitorPattern.element;

import com.designPatterns.visitorPattern.visitor.IVisitor;

/**
 * The {@link Stuart}.
 * <p>
 * This class represents the concrete element in the
 * visitor pattern. Its purpose is to pass itself to
 * the visitor so the visitor can perform additional
 * operations on its behalf. 
 * <p>
 * In the attendance example, this class will not respond
 * when called, it is up to the visitor to respond on 
 * its behalf.
 * <p>
 * @author szeyick
 */
public class Stuart implements IElement {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
