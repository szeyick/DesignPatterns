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
public class StuartsForm extends Form {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "Stuart";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String dateOfBirth() {
		return "01/01/2015";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String countryOfResidence() {
		return "Australia";
	}
}
