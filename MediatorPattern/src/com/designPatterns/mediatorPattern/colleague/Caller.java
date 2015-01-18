package com.designPatterns.mediatorPattern.colleague;

/**
 * The {@link Caller}.
 * <p>
 * This colleague class represents the caller. The
 * colleagues job is to call the call center to make
 * a request to the correct department.
 * <p>
 * @author szeyick
 */
public class Caller implements IColleague {

	/**
	 * The name of the caller.
	 */
	private String callerName;

	/**
	 * Constructor.
	 * @param callerNameTmp - The name of the caller.
	 */
	public Caller(String callerNameTmp) {
		callerName = callerNameTmp;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return callerName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void answer(IColleague sender) {
		// The user doesn't answer requests.
	}
}
