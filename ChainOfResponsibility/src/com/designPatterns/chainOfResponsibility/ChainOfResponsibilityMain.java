package com.designPatterns.chainOfResponsibility;

import com.designPatterns.chainOfResponsibility.chain.LeftClickHandler;
import com.designPatterns.chainOfResponsibility.chain.MiddleClickHandler;
import com.designPatterns.chainOfResponsibility.chain.MouseEventHandler;
import com.designPatterns.chainOfResponsibility.chain.RightClickHandler;
import com.designPatterns.chainOfResponsibility.mouseEvent.MouseEvent;
import com.designPatterns.chainOfResponsibility.mouseEvent.MouseEventType;

/**
 * The {@link ChainOfResponsibilityMain}
 * <p>
 * This class functions as both the program main
 * and also the the client. It is responsible for
 * creating the event to pass onto the concrete
 * handlers.
 * <p>
 * @author szeyick
 */
public class ChainOfResponsibilityMain {

	/**
	 * The program main.
	 * @param args - The command line arguments.
	 */
	public static void main(String[] args) {
		MouseEventHandler mouseEventHandlerChain = buildChainOfResponsibility();

		// Create mouse events.
		MouseEvent mouseEvent = new MouseEvent(MouseEventType.RIGHT_CLICK);
		boolean eventProcessed = mouseEventHandlerChain.processEvent(mouseEvent);

		hasEventProcessed(eventProcessed);

		mouseEvent = new MouseEvent(MouseEventType.LEFT_CLICK);
		eventProcessed = mouseEventHandlerChain.processEvent(mouseEvent);

		hasEventProcessed(eventProcessed);
		
		mouseEvent = new MouseEvent(MouseEventType.MIDDLE_CLICK);
		eventProcessed = mouseEventHandlerChain.processEvent(mouseEvent);

		hasEventProcessed(eventProcessed);
		
		mouseEvent = new MouseEvent(MouseEventType.UNIDENTIFIED_CLICK);
		eventProcessed = mouseEventHandlerChain.processEvent(mouseEvent);

		hasEventProcessed(eventProcessed);
	}

	/**
	 * Has the event been processed by a handler.
	 * @param processed - The event processed state as a boolean.
	 */
	private static void hasEventProcessed(boolean processed) {
		System.out.println("The mouse event has been processed - " + processed);
		System.out.println();
	}

	/**
	 * Initialise the chain of mouse event handlers.
	 * @return An initialised instance of the chain of responsibility.
	 */
	private static MouseEventHandler buildChainOfResponsibility() {
		MouseEventHandler leftClickHandler = new LeftClickHandler();
		MouseEventHandler rightClickHandler = new RightClickHandler();
		MouseEventHandler middleClickHandler = new MiddleClickHandler();

		// Set the handler chain.
		leftClickHandler.setNextLogger(rightClickHandler);
		rightClickHandler.setNextLogger(middleClickHandler);

		return leftClickHandler;
	}

}
