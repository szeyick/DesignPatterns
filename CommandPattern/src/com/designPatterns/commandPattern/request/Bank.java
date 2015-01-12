package com.designPatterns.commandPattern.request;

/**
 * The {@link Bank}.
 * <p>
 * This class is responsible for being the receiver. 
 * It receives the request from the ConcreteCommand.
 * <p>
 * @author szeyick
 */
public class Bank {

	/**
	 * Request to withdraw money.
	 * @param value - The amount of money to withdraw.
	 * @return the withdrawn money.
	 */
	public int withdraw(int value) {
		System.out.println("Withdrawing $" + value);
		return value;
	}
	
	/**
	 * Deposit money.
	 * @param value - The amount of money to deposit.
	 */
	public void deposit(int value) {
		System.out.println("Depositing $" + value);
	}
}
