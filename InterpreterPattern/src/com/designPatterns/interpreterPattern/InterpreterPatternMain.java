package com.designPatterns.interpreterPattern;

import com.designPatterns.interpreterPattern.expression.AndExpression;
import com.designPatterns.interpreterPattern.expression.IExpression;
import com.designPatterns.interpreterPattern.expression.OrExpression;
import com.designPatterns.interpreterPattern.expression.TerminalExpression;

/**
 * The {@link InterpreterPatternMain}
 * <p>
 * This class represents the Client in the Interpreter Pattern. It 
 * constructs the terminal expressions, which set up the grammar in 
 * the language. 
 * <p>
 * The non-terminal expressions, take the grammar and validates the
 * context (the parsed in data) to return to the user. The interpret
 * method in the non-terminal expression is the method that determines
 * if the parsed in data is valid against the rules set in the expression.
 * <p>
 * @author szeyick
 */
public class InterpreterPatternMain {
	
	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Create the language and grammar
		IExpression isMale = getMaleExpression();
		IExpression isFemale = getFemaleExpression();
		
		boolean isPersonMale = isMale.interpret("John");
		boolean isPersonMarried = isFemale.interpret("Married Julie");
		
		System.out.println("Is John a male - " + isPersonMale);
		System.out.println("Is Julie a married woman - " + isPersonMarried);
	}
	
	/**
	 * Define the grammar for the language.
	 * @return an instantiated instance of the non-terminal
	 * expression.
	 */
	private static IExpression getMaleExpression() {
		// Create the grammar for the language (male language)
		IExpression robert = new TerminalExpression("Robert");
		IExpression john = new TerminalExpression("John");
		
		// Add the grammar of the language to the rule set (non-terminal expression)
		return new OrExpression(robert, john);
	}
	
	/**
	 * Define the grammar for the language.
	 * @return an instantiated instance of the non-terminal
	 * expression.
	 */
	private static IExpression getFemaleExpression() {
		// Create the grammar for the language (female language)
		IExpression julie = new TerminalExpression("Julie");
		IExpression married = new TerminalExpression("Married");
		
		// Add the grammar of the language to the rule set (non-terminal expression)
		return new AndExpression(julie, married);
	}

}
