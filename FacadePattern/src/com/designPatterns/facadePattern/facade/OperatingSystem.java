package com.designPatterns.facadePattern.facade;

import com.designPatterns.facadePattern.subSystem.GoogleChrome;
import com.designPatterns.facadePattern.subSystem.IProgram;
import com.designPatterns.facadePattern.subSystem.ITunes;
import com.designPatterns.facadePattern.subSystem.MicrosoftWord;

/**
 * The {@link OperatingSystem}.
 * <p>
 * This class functions as the facade. It acts
 * as the interface between the client and the
 * subsystem components. Clients will access
 * the subsystem components through this class.
 * <p>
 * The facade will know which subsystem components
 * will respond to a particular event so it will know
 * where to dispatch requests from the client to.
 * <p>
 * @author szeyick
 */
public class OperatingSystem {

	/**
	 * The iTunes program.
	 */
	private IProgram iTunes;
	
	/**
	 * The Google Chrome program.
	 */
	private IProgram googleChrome;
	
	/**
	 * The Microsoft Word program.
	 */
	private IProgram microsoftWord;
	
	/**
	 * Constructor.
	 */
	public OperatingSystem() {
		iTunes = new ITunes();
		googleChrome = new GoogleChrome();
		microsoftWord = new MicrosoftWord();
	}
	
	/**
	 * Open iTunes.
	 */
	public void openITunes() {
		iTunes.openProgram();
	}
	
	/**
	 * Open Google Chrome.
	 */
	public void openGoogleChrome() {
		googleChrome.openProgram();
	}
	
	/**
	 * Open Microsoft Word.
	 */
	public void openMicrosoftWord() {
		microsoftWord.openProgram();
	}
}
