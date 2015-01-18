package com.designPatterns.mediatorPattern.colleague;

/**
 * The {@link IColleague}.
 * <p>
 * This interface is responsible for unifying the
 * colleague objects in the mediator pattern. 
 * <p>
 * @author szeyick
 *
 */
public interface IColleague {

	/**
	 * @return - The name of the colleague object
	 */
	public String name();
	
	/**
	 * Answer a sender request.
	 * @param sender - The sender.
	 */
	public void answer(IColleague sender);
}
