package com.vidyaviewer.it4045cgroup9.dto;

public class UserGameDTO {

	private int userID;
	private int GameID;
	private double userRating;
	private String userDescription;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getGameID() {
		return GameID;
	}

	public void setGameID(int gameID) {
		GameID = gameID;
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
