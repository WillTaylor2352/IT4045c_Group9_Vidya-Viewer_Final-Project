package com.vidyaviewer.it4045cgroup9.dto;

public class GameDTO {

	private int gameID;
	private String title;
	private double myRating;
	private String userDescription;

	// ---------------------------------
	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	// ---------------------------------
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// ---------------------------------
	public double getMyRating() {
		return myRating;
	}

	public void setMyRating(double myRating) {
		this.myRating = myRating;
	}

	// ---------------------------------
	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}
	// ---------------------------------

	@Override
	public String toString() {
		return "Title: " + this.title + ", My Rating: " + this.myRating + ", Description: " + this.userDescription;
	}
}
