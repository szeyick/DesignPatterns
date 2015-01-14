package com.designPatterns.interpreterPattern.expression;

/**
 * The {@link IExpression}
 * <p>
 * This interface represents the AbstractExpression
 * in the Interpreter Pattern. It provides the 
 * interpret method to allow an object to validate
 * the context. 
 * <p>
 * The interpret method functions as a way to prove
 * that the provided grammar/data follows the rules
 * defined by the implementing class of this interface.
 * <p>
 * @author szeyick
 */
public interface IExpression {

	/**
	 * Validate the context against the rules that
	 * are represented by the implementing class.
	 * @param context - The grammar to validate.
	 * @return <code>true</code> if the context follows
	 * the defined rules in the class, <code>false</code>
	 * otherwise.
	 */
	public boolean interpret(String context);
}
