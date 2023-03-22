package com.vidyaviewer.it4045cgroup9.dto;

public class GameDTO {

	private int gameID;
	private String title;
	private double criticScore;

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

	public double getCriticScore() {
		return criticScore;
	}

	public void setCriticScore(double criticScore) {
		this.criticScore = criticScore;
	}

	@Override
	public String toString() {
		return "Title: " + this.title;
	}
}
