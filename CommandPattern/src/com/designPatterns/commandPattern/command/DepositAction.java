package com.designPatterns.commandPattern.command;

import com.designPatterns.commandPattern.request.Bank;

/**
 * The {@link DepositAction}
 * <p>
 * This class functions as the ConcreteCommand. It executes
 * commands on behalf the invoker, and it passes the request
 * to execute onto the receiver {@link Bank}.
 * <p>
 * @author szeyick
 */
public class DepositAction implements IBankAction {

	/**
	 * A reference to the receiver to process the
	 * commands. 
	 */
	private Bank bank;
	
	/**
	 * The value to withdraw.
	 */
	private int depositValue;
	
	/**
	 * Constructor.
	 * @param bankTmp - The bank object. 
	 */
	public DepositAction(Bank bankTmp) {
		bank = bankTmp;
		depositValue = 0;
	}

	/**
	 * Set the value to the command of the amount that
	 * we want to deposit.
	 * @param value - The value to deposit.
	 */
	public void setDepositValue(int value) {
		depositValue = value;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute() {
		bank.deposit(depositValue);
	}
}
