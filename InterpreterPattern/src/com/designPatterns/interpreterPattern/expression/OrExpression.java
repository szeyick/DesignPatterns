package com.designPatterns.interpreterPattern.expression;

/**
 * The {@link OrExpression}
 * <p>
 * This class represents the non-terminal expression in the
 * Interpreter Pattern. These classes function as the "rules"
 * when validating a context.
 * <p>
 * This class takes in a collection of terminal expressions
 * which make up the "rule-set" or the language of this expression.
 * <p>
 * The interpret method here will take the context and make sure
 * that it is part of the language and that it also follows the
 * rules laid out in this class.
 * <p>
 * This class will validate context against the language/grammar
 * defined by the terminal expressions and the OR condition.
 * <p>
 * @author szeyick
 */
public class OrExpression implements IExpression {

	/**
	 * The first terminal expression.
	 */
	private IExpression expression1;

	/**
	 * The second terminal expression.
	 */
	private IExpression expression2;
	
	/**
	 * Constructor that takes in the expressions to compare.
	 * @param expression1Tmp - The first terminal expression to compare.
	 * @param expression2Tmp - The second terminal expression to compare.
	 */
	public OrExpression(IExpression expression1Tmp, IExpression expression2Tmp) {
		expression1 = expression1Tmp;
		expression2 = expression2Tmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean interpret(String context) {
		// Validate the context against the language and the rules of the class.
		return expression1.interpret(context) || expression2.interpret(context);
	}
}
