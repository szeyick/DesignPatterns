package com.designPatterns.commandPattern.command;

import com.designPatterns.commandPattern.request.Bank;

/**
 * The {@link WithdrawAction}
 * <p>
 * This class functions as the ConcreteCommand. It executes
 * commands on behalf the invoker, and it passes the request
 * to execute onto the receiver {@link Bank}.
 * <p>
 * @author szeyick
 */
public class WithdrawAction implements IBankAction {

	/**
	 * A reference to the receiver to process the
	 * commands. 
	 */
	private Bank bank;
	
	/**
	 * The value to withdraw.
	 */
	private int withdrawValue;
	
	/**
	 * Constructor.
	 * @param bankTmp - The bank object. 
	 */
	public WithdrawAction(Bank bankTmp) {
		bank = bankTmp;
		withdrawValue = 0;
	}

	/**
	 * Set the value to the command of the amount that
	 * we want to withdraw.
	 * @param value - The value to withdraw.
	 */
	public void setWithdrawValue(int value) {
		withdrawValue = value;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute() {
		bank.withdraw(withdrawValue);
	}
}
