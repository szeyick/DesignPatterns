package com.designPatterns.observerPattern;

import com.designPatterns.observerPattern.observer.User;
import com.designPatterns.observerPattern.subject.Celebrity;

/**
 * The {@link ObserverPatternMain}
 * <p>
 * This is the program main that demonstrates the observer
 * pattern. It creates the subject and observers and controls
 * the subjects to trigger an update to the observers.
 * <p>
 * @author szeyick
 */
public class ObserverPatternMain {

	/**
	 * The program main.
	 * @param args - Command line arguments.
	 */
	public static void main(String[] args) {
		// Create some celebrities (Subjects)
		Celebrity michaelJordan = new Celebrity("Michael Jordan");
		Celebrity kobeBryant = new Celebrity("Kobe Bryant");
		
		// Create some users and follow the celebrities.
		new User("Stuart", michaelJordan);
		new User("Jerry", michaelJordan);
		
		new User("Carl", kobeBryant);
		new User("Dave", kobeBryant);
		
		// Send some tweets.
		michaelJordan.sendTweet("Making a comeback #23 #workingHard");
		kobeBryant.sendTweet("Resting up for Saturdays game...");
		
		michaelJordan.sendTweet("Playing gold with the #president");
		kobeBryant.sendTweet("Good luck for tonight boys #lakers");
	}
}
