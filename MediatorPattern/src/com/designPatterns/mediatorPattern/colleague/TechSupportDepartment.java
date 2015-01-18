package com.designPatterns.mediatorPattern.colleague;

/**
 * The {@link TechSupportDepartment}
 * <p>
 * This class represents a department in the call center. It
 * is another instance of a colleague object in the mediator
 * pattern.
 * <p>
 * @author szeyick
 */
public class TechSupportDepartment implements IColleague {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Tech Support";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void answer(IColleague sender) {
		System.out.print("Hello " + sender.name());
		System.out.print(" you have reached the " + name());
		System.out.println(" how may I help you today...");
		System.out.println();
	}
}
