package com.designPatterns.commandPattern.main;

import com.designPatterns.commandPattern.command.DepositAction;
import com.designPatterns.commandPattern.command.WithdrawAction;
import com.designPatterns.commandPattern.invoker.Customer;
import com.designPatterns.commandPattern.request.Bank;

/**
 * The {@link CommandPatternMain}.
 * <p>
 * This class functions as the program main. It
 * is responsible for creating all the required
 * objects to demonstrate the command pattern.
 * <p>
 * It creates the Concrete Commands to pass to the
 * invoker who can execute the action. In this example
 * the invoker knows nothing of the recipient, just that
 * it can execute the requested action..
 * <p>
 * @author szeyick
 */
public class CommandPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("The Command Pattern...");
		Bank bank = new Bank();
		
		WithdrawAction withdrawAction = new WithdrawAction(bank);
		DepositAction depositAction = new DepositAction(bank);
		
		Customer customer = new Customer();
		
		// Set the context to the withdraw and deposit action.
		withdrawAction.setWithdrawValue(100);
		depositAction.setDepositValue(50);
		
		// Have the invoker call the deposit command to execute.
		customer.performRequest(depositAction);
		
		System.out.println();
		
		// Have the invoker call the withdraw command to execute.
		customer.performRequest(withdrawAction);
	}
}
