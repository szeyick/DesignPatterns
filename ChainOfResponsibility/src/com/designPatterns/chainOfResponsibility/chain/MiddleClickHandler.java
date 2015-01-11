package com.designPatterns.chainOfResponsibility.chain;

import com.designPatterns.chainOfResponsibility.mouseEvent.MouseEvent;
import com.designPatterns.chainOfResponsibility.mouseEvent.MouseEventType;

/**
 * The {@link MiddleClickHandler}
 * <p>
 * This class functions as the ConcreteHandler in the 
 * Chain of Responsibility pattern. It handles the 
 * incoming mouse event, if the incoming event is not
 * a middle click, then it passes it onto the next handler
 * if available, otherwise it will return.
 * <p>
 * @author szeyick
 */
public class MiddleClickHandler extends MouseEventHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean processEvent(MouseEvent mouseEvent) {
		// If the mouse event is a right click we process it in this handler.
		if (MouseEventType.MIDDLE_CLICK.equals(mouseEvent.getMouseEventType())) {
			System.out.println("Processing Middle Click Mouse Event...");
			return true;
		}
		return super.processEvent(mouseEvent);
	}
}
