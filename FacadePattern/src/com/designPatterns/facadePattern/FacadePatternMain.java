package com.designPatterns.facadePattern;

import com.designPatterns.facadePattern.facade.OperatingSystem;

/**
 * The {@link FacadePatternMain}.
 * <p>
 * This class functions as the program main that
 * demonstrates the functionality of the facade
 * pattern. This class acts as the client.
 * <p>
 * @author szeyick
 */
public class FacadePatternMain {
	
	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		OperatingSystem operatingSystem = new OperatingSystem();
		
		operatingSystem.openITunes();
		System.out.println();
		operatingSystem.openGoogleChrome();
		System.out.println();
		operatingSystem.openMicrosoftWord();
	}
}
