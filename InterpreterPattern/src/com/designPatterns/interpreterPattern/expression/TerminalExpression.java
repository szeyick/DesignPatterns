package com.designPatterns.interpreterPattern.expression;

/**
 * The {@link TerminalExpression}.
 * <p>
 * This class represents the terminal expression in the Interpreter
 * Pattern. It is used to store the grammar of the language. It uses
 * the interpret method to ensure that the parsed in data contains the
 * grammar defined in the class.
 * <p>
 * In other words, it makes sure that the parsed in "words" are part
 * of the "language" initially defined in the class. For example if
 * the language set in this expression is English, then the interpret
 * method is to ensure that the incoming word is in English. 
 * <p>
 * @author szeyick
 */
public class TerminalExpression implements IExpression {

	/**
	 * The initial grammar/language that this expression
	 * contains.
	 */
	private String data;
	
	/**
	 * Constructor.
	 * @param dataTmp - The initial grammar for the expression.
	 */
	public TerminalExpression(String dataTmp) {
		data = dataTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean interpret(String context) {
		// Verify that the context (word) is part of the language
		// defined in this class.
		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
