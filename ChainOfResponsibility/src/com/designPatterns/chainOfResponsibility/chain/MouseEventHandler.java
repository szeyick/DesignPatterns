package com.designPatterns.chainOfResponsibility.chain;

import com.designPatterns.chainOfResponsibility.mouseEvent.MouseEvent;

/**
 * The {@link MouseEventHandler}
 * <p>
 * This class represents the handler interface
 * class.   
 * <p>
 * @author szeyick
 */
public abstract class MouseEventHandler {
	
	/**
	 * Reference to the next mouse handler.
	 */
	protected MouseEventHandler nextHandler;
	
	/**
	 * Assign the next handler in the responsibility chain.
	 * @param nextHandlerTmp - The next handler.
	 */
	public void setNextLogger(MouseEventHandler nextHandlerTmp) {
		nextHandler = nextHandlerTmp;
	}
	
	/**
	 * Process the incoming message event.
	 * @param mouseEvent - The message to process
	 * @return <code>true</code> if the message is processed, 
	 * <code>false</code> otherwise.
	 */
	public boolean processEvent(MouseEvent mouseEvent) {
		if (nextHandler != null) {
			// If the mouse event is not a right click, we see if there is another
			// handler to pass the event on.
			return nextHandler.processEvent(mouseEvent);
		}
		else {
			// Return false if we've reached the end of the chain and the message
			// has not been processed. 
			return false;
		}
	}
}
