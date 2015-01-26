package com.designPatterns.templateMethod.template;

/**
 * The {@link StuartsForm}.
 * <p>
 * This class represents the concrete subclass that 
 * implements the abstract methods from the template.
 * <p>
 * It implements the abstract methods to provide attributes
 * to the parent class.
 * <p>
 * @author szeyick
 */
public class JerrysForm extends Form {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "Jerry";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String dateOfBirth() {
		return "31/12/2012";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String countryOfResidence() {
		return "England";
	}
}
