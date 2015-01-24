package com.designPatterns.strategyPattern.strategy;

/**
 * The {@link AddOperation}
 * <p>
 * This class represents the concrete strategy object
 * in the pattern. It implements the strategy interface
 * and provides the behaviour that is specific to what
 * this class is to implement.
 * <p>
 * This concrete strategy class implements the algorithm to
 * add two numbers.
 * <p>
 * @author szeyick
 */
public class AddOperation implements IOperation {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int performOperation(int num1, int num2) {
		return num1 + num2;
	}
}
