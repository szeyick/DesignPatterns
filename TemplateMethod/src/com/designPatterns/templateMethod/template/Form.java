package com.designPatterns.templateMethod.template;

/**
 * The {@link Form}
 * <p>
 * This class is responsible for the providing
 * the common behaviour of the algorithm. It functions
 * as the "template" in the template method.
 * <p>
 * In the example, the template defines a welcome form
 * and contains abstract methods to retrieve the name,
 * date of birth and city of residence from implementing
 * subclasses.
 * <p>
 * @author szeyick
 */
public abstract class Form {

	/**
	 * @return - The name to place in the form.
	 */
	public abstract String getName();
	
	/**
	 * @return - The date of birth.
	 */
	public abstract String dateOfBirth();
	
	/**
	 * @return - The city of residence.
	 */
	public abstract String countryOfResidence();
	
	/**
	 * Implementation of the template method.
	 */
	public void printFormDetails() {
		System.out.println("Hello " + getName());
		System.out.println("Welcome back to the bank");
		System.out.println("Your details are - ");
		System.out.println("Date of Birth - " + dateOfBirth());
		System.out.println("Country of Residence - " + countryOfResidence());
	}
}
