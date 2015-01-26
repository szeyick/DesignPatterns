package com.designPatterns.templateMethod;

import com.designPatterns.templateMethod.template.JerrysForm;
import com.designPatterns.templateMethod.template.StuartsForm;

/**
 * The {@link TemplateMethodMain}
 * <p>
 * This class is responsible for demonstrating the template
 * method. It creates the concrete subclasses and then calls
 * the template method. Each subclass is expected to provide
 * attributes to the template to complete the form.
 * <p>
 * @author szeyick
 */
public class TemplateMethodMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		StuartsForm stuartsForm = new StuartsForm();
		JerrysForm jerrysForm = new JerrysForm();
		
		stuartsForm.printFormDetails();
		System.out.println();
		jerrysForm.printFormDetails();
	}
}
