package com.designPatterns.observerPattern.subject;

/**
 * The {@link ICelebrityFollower}
 * <p>
 * This interface defines the methods that will be
 * triggered by the subject when it wants to notify
 * its observers of changes. It functions as the
 * subject in the observer pattern.
 * <p>
 * @author szeyick
 */
public interface ICelebrityFollower {

	/**
	 * Method that is called by the implementing class
	 * when a tweet is sent.
	 * @param tweet - The tweet sent.
	 */
	public void tweetSent(String tweet);
}
