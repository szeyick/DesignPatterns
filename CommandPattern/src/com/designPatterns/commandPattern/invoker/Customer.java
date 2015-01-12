package com.designPatterns.commandPattern.invoker;

import com.designPatterns.commandPattern.command.IBankAction;

/**
 * The {@link Customer}.
 * <p>
 * This class represents the Invoker in the 
 * Command Pattern. It contains a reference to
 * the ConcreteCommands to execute. This customer
 * class can set context parameters to the ConcreteCommands.
 * <p>
 * @author szeyick
 */
public class Customer {

	/**
	 * Have the customer perform an command.
	 * @param command - The command to perform.
	 */
	public void performRequest(IBankAction command) {
		command.execute();
	}
}
