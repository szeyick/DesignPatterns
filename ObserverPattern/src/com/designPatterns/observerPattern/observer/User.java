package com.designPatterns.observerPattern.observer;

import com.designPatterns.observerPattern.subject.Celebrity;
import com.designPatterns.observerPattern.subject.ICelebrityFollower;

/**
 * The {@link User}
 * <p>
 * This class functions as the Observer and Concrete Observer in
 * the pattern. It implements the {@link ICelebrityFollower} interface
 * which allows it to be notified of updates from the celebrity that
 * it follows (observes)
 * <p>
 * In addition, this class will maintain a reference to the Celebrity (Subject)
 * although this isn't always neccessary as it can always be passed through when
 * the celebrity notifies its follows that its state has changed.
 * <p>
 * @author szeyick
 */
public class User implements ICelebrityFollower {

	/**
	 * A reference to the celebrity that the user is following.
	 */
	private Celebrity celebrity;
	
	/**
	 * The username for this user.
	 */
	private String username;
	
	/**
	 * Constructor.
	 */
	public User(String usernameTmp, Celebrity celebrityTmp) {
		celebrity = celebrityTmp;
		username = usernameTmp;
		
		// The celebrity that we want to follow.
		celebrity.followCelebrity(this);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void tweetSent(String tweet) {
		System.out.println(username + " has received a tweet update...");
		System.out.println(celebrity.getCelebrityName() + " just sent a tweet - " + tweet);
		System.out.println();
	}
}
