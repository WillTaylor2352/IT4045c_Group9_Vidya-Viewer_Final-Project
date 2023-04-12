package com.vidyaviewer.it4045cgroup9.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GameDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int gameID;
	private String title;
	private String criticScore;

	public GameDTO() {
	};

	public GameDTO(int gameID, String title, String criticScore) {
		this.gameID = gameID;
		this.title = title;
		this.criticScore = criticScore;
	}

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

	public String getCriticScore() {
		return criticScore;
	}

	public void setCriticScore(String d) {
		this.criticScore = d;
	}

	@Override
	public String toString() {
		return "Title: " + this.title;
	}
}
