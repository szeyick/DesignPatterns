package com.designPatterns.strategyPattern;

import com.designPatterns.strategyPattern.context.Context;
import com.designPatterns.strategyPattern.strategy.AddOperation;
import com.designPatterns.strategyPattern.strategy.DivideOperation;
import com.designPatterns.strategyPattern.strategy.IOperation;
import com.designPatterns.strategyPattern.strategy.MultiplyOperation;
import com.designPatterns.strategyPattern.strategy.SubtractOperation;

/**
 * The {@link StrategyPatternMain}
 * <p>
 * This is the program main for the strategy 
 * pattern. It create the different strategy
 * algorithms for our calculator demo. The
 * context holds the currently used algorithm
 * and the numbers to calculate. 
 * <p>
 * To perform different calculator operations on
 * the values, we can switch out the strategy in
 * the context and evaluate.
 * <p>
 * @author szeyick
 */
public class StrategyPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Create the strategy algorithms.
		IOperation addOperation = new AddOperation();
		IOperation subtractOperation = new SubtractOperation();
		IOperation multiplyOperation = new MultiplyOperation();
		IOperation divideOperation = new DivideOperation();
		
		// Assign a initial operation to the context object.
		Context calculator = new Context(addOperation);
		
		// Calculate values.
		System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));
		
		// Change the context to use the subtract strategy algorithm. 
		calculator.updateOperation(subtractOperation);
		System.out.println("10 - 5 = " + calculator.executeOperation(10, 5));
		
		// Change the context to use the multiply strategy algorithm. 
		calculator.updateOperation(multiplyOperation);
		System.out.println("10 * 5 = " + calculator.executeOperation(10, 5));
		
		// Change the context to use the divide strategy algorithm. 
		calculator.updateOperation(divideOperation);
		System.out.println("10 / 5 = " + calculator.executeOperation(10, 5));
	}
}
