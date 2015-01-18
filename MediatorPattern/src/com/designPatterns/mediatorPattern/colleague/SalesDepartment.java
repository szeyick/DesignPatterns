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
public class SalesDepartment implements IColleague {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String name() {
		return "Sales Department";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void answer(IColleague sender) {
		System.out.print("Hello " + sender.name());
		System.out.print(" you have reached the " + name());
		System.out.println(" would you like to purchase something...");
		System.out.println();
	}
}
