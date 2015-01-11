package com.designPatterns.chainOfResponsibility.mouseEvent;

/**
 * The {@link MouseEvent}.
 * <p>
 * This class represents the message that is sent
 * by the client to a handler. It can contain different
 * types of parameters that can be processed by the
 * concreteHandlers. 
 * <p>
 * @author szeyick
 */
public class MouseEvent {

	/**
	 * The event type associated with this
	 * message.
	 */
	private MouseEventType eventType;
	
	/**
	 * Constructor.
	 * @param eventTyepTmp - The type of event associated
	 * to the message.
	 */
	public MouseEvent(MouseEventType eventTypeTmp) {
		eventType = eventTypeTmp;
	}
	
	/**
	 * @return - The type fo mouse event in this 
	 * message.
	 */
	public MouseEventType getMouseEventType() {
		return eventType;
	}
}
