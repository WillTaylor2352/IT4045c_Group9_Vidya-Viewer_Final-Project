package com.vidyaviewer.it4045cgroup9.dto;

//THIS CLASS USED TO LOGICALLY SEPARATE A USER'S GAME-DESCRIBING DATA FROM THE GLOBAL-GAME DATA
public class UserGameDTO {

	private int userID;
	private int gameID;
	private double userRating;
	private String userDescription;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		gameID = gameID;
	}

	// ---------------------------------
	public double getUserRating() {
		return userRating;
	}

	public void setUserRating(double myRating) {
		this.userRating = myRating;
	}

	// ---------------------------------
	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	// ---------------------------------

}
