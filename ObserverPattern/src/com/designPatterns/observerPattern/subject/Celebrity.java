package com.designPatterns.observerPattern.subject;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@link Celebrity}
 * <p>
 * This class functions as the subject in the
 * observer pattern. Observers register themselves
 * with this class such that when it is updated
 * it can notify all its observers that something has
 * changed.
 * <p>
 * @author szeyick
 */
public class Celebrity {

	/**
	 * A list of follower that are subscribed to this
	 * celebrity.
	 */
	private List<ICelebrityFollower> followersList;
	
	/**
	 * The name of the celebrity.
	 */
	private String celebrityName;
	
	/**
	 * Constructor.
	 */
	public Celebrity(String celebrityNameTmp) {
		celebrityName = celebrityNameTmp;
		followersList = new ArrayList<ICelebrityFollower>();
	}
	
	/**
	 * Follow a celebrity.
	 * @param follower - The celebrities follower.
	 */
	public void followCelebrity(ICelebrityFollower follower) {
		followersList.add(follower);
	}
	
	/**
	 * Send a tweet on behalf of the celebrity.
	 * @param tweet - The tweet to send.
	 */
	public void sendTweet(String tweet) {
		notifyFollowers(tweet);
	}
	
	/**
	 * Notify all the followers (observers) that this 
	 * celebrity just sent out a tweet.
	 * @param tweet - The tweet sent.
	 */
	private void notifyFollowers(String tweet) {
		for (ICelebrityFollower observer : followersList) {
			observer.tweetSent(tweet);
		}
	}
	
	/**
	 * @return - The name of the celebrity
	 */
	public String getCelebrityName() {
		return celebrityName;
	}
}
