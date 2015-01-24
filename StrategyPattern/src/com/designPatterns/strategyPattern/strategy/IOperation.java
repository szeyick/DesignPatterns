package com.designPatterns.strategyPattern.strategy;

/**
 * The {@link IOperation}.
 * <p>
 * This interface class represents the strategy
 * interface in the strategy pattern. It defines
 * the common behaviour that the concrete strategy
 * classes need to implement. It provides the interface
 * that can be called by the context.
 * <p>
 * @author szeyick
 */
public interface IOperation {

	/**
	 * Perform an operation on two numbers.
	 * @param num1 - The first number.
	 * @param num2 - The second number.
	 * @return - The result of the operation from the 
	 * algorithm.
	 */
	public int performOperation(int num1, int num2);
}
