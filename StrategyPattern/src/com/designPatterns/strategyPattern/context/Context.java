package com.designPatterns.strategyPattern.context;

import com.designPatterns.strategyPattern.strategy.IOperation;

/**
 * The {@link Context}
 * <p>
 * This class represents the context in the strategy
 * pattern. It acts on behalf of the client and performs
 * operations on two numbers. The type of operation that is
 * performed is dependant on the strategy (algorithm) that
 * is currently assigned to this context.
 * <p>
 * It evaluates the two numbers on behalf of the client by
 * passing it onto the strategy to work out.
 * <p>
 * @author szeyick
 */
public class Context {

	/**
	 * The current algorithm to execute.
	 */
	private IOperation currentOperation;
	
	/**
	 * Constructor.
	 * @param currentOperationTmp - The algorithm to 
	 * evaluate the values.
	 */
	public Context(IOperation currentOperationTmp) {
		currentOperation = currentOperationTmp;
	}
	
	/**
	 * Update the strategy to be used in the context.
	 * @param newOperation - The new strategy algorithm to use.
	 */
	public void updateOperation(IOperation newOperation) {
		currentOperation = newOperation;
	}
	
	/**
	 * Execute the operation on behalf of the client by
	 * passing the data onto the current strategy algorithm.
	 * @param num1 - The first number.
	 * @param num2 - The second number.
	 * @return the result calculated by the current algorithm.
	 */
	public int executeOperation(int num1, int num2) {
		return currentOperation.performOperation(num1, num2);
	}
}
