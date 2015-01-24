package com.designPatterns.strategyPattern.strategy;

/**
 * The {@link MultiplyOperation}
 * <p>
 * This class represents the concrete strategy object
 * in the pattern. It implements the strategy interface
 * and provides the behaviour that is specific to what
 * this class is to implement.
 * <p>
 * This concrete strategy class implements the algorithm to
 * multiply two numbers.
 * <p>
 * @author szeyick
 */
public class MultiplyOperation implements IOperation {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int performOperation(int num1, int num2) {
		return num1 * num2;
	}
}
