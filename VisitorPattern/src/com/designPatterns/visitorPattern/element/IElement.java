package com.designPatterns.visitorPattern.element;

import com.designPatterns.visitorPattern.visitor.IVisitor;

/**
 * The {@link IElement}
 * <p>
 * This interface class represents the element in
 * the visitor pattern. The purpose of this class is
 * to provide its implementing subclasses access to
 * the visitor object. 
 * <p>
 * @author szeyick
 */
public interface IElement {

	/**
	 * Pass the visitor to the element.
	 * @param visitor - The visitor that will manage the
	 * extended method calls. 
	 */
	public void accept(IVisitor visitor);
}
