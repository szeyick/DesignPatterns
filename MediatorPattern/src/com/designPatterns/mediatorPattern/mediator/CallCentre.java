package com.designPatterns.mediatorPattern.mediator;

import java.util.HashMap;
import java.util.Map;

import com.designPatterns.mediatorPattern.colleague.IColleague;
import com.designPatterns.mediatorPattern.colleague.SalesDepartment;
import com.designPatterns.mediatorPattern.colleague.TechSupportDepartment;

/**
 * The {@link CallCentre}
 * <p>
 * This class functions as the mediator object in the
 * pattern. The colleague objects send their requests
 * to the mediator so it can re-route it correctly.
 * <p>
 * @author szeyick
 */
public class CallCentre {

	/**
	 * A collection of the departments in the call centre.
	 */
	private Map<String, IColleague> departments;
	
	/**
	 * Constructor. 
	 */
	public CallCentre() {
		departments = new HashMap<String, IColleague>();
		createDepartments();
	}
	
	/**
	 * Set up the departments in the call centre.
	 */
	private void createDepartments() {
		IColleague techSupport = new TechSupportDepartment();
		IColleague sales = new SalesDepartment();
		
		departments.put(techSupport.name(), techSupport);
		departments.put(sales.name(), sales);
	}
	
	/**
	 * Method to re-route a request from the sender to the correct
	 * department.
	 * @param sender - The sender of the request.
	 * @param department - The department the request is going to.
	 */
	public void processRequest(IColleague sender, String departmentRequest) {
		System.out.println("Re-routing request...");
		System.out.println();
		
		IColleague department = departments.get(departmentRequest);
		if (department != null) {
			department.answer(sender);
		}
		else {
			System.out.println("Sorry could not process request - department doesn't exist");
		}
	}
}
