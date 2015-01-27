package com.designPatterns.visitorPattern.visitor;

import com.designPatterns.visitorPattern.element.Dave;
import com.designPatterns.visitorPattern.element.Jerry;
import com.designPatterns.visitorPattern.element.Stuart;

/**
 * The {@link IVisitor}
 * <p>
 * This interface class represents the Visitor interface
 * in the pattern. It will provide all the method signatures
 * that will correspond to all the different element objects
 * that it will handle.
 * <p>
 * In the class room example, this interface will provide
 * methods to handle all the attending children (elements).
 * <p>
 * @author szeyick
 */
public interface IVisitor {

	/**
	 * The method signature that will respond
	 * when Stuart is passed to the visitor.
	 * @param stuart - The stuart object.
	 */
	public void visit(Stuart stuart);
	
	/**
	 * The method signature that will respond
	 * when Jerry is passed to the visitor.
	 * @param jerry - The Jerry object.
	 */
	public void visit(Jerry jerry);
	
	/**
	 * The method signature that will respond
	 * when Dave is passed to the visitor.
	 * @param dave - The Dave object.
	 */
	public void visit(Dave dave);
}
