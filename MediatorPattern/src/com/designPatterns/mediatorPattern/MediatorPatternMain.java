package com.designPatterns.mediatorPattern;

import com.designPatterns.mediatorPattern.colleague.Caller;
import com.designPatterns.mediatorPattern.colleague.IColleague;
import com.designPatterns.mediatorPattern.mediator.CallCentre;

/**
 * The {@link MediatorPatternMain}
 * <p>
 * This class represents the program main for
 * the mediator pattern demo. It creates the 
 * call centre and the colleague objects. The
 * user colleague object communicates with the
 * call centre to get to the right department.
 * <p>
 * @author szeyick
 */
public class MediatorPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		CallCentre callCentre = new CallCentre();
		
		IColleague caller = new Caller("John");
		
		// Send a request to the sales department.
		callCentre.processRequest(caller, "Sales Department");
		
		// Send a request to the tech support department.
		callCentre.processRequest(caller, "Tech Support");
		
		// Send a request to a random department
		callCentre.processRequest(caller, "Random department");
	}
}
