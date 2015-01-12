package com.designPatterns.commandPattern.command;

/**
 * The {@link IBankAction}.
 * <p>
 * This interface functions as the Command.
 * It provides the execute method for the implementing
 * classes to call. The invoker calls this method to
 * execute the command.
 * <p>
 * @author szeyick
 */
public interface IBankAction {

	/**
	 * Execute the banking action.
	 */
	public void execute();
}
