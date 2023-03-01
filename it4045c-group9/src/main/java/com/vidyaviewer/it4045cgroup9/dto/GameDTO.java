package com.vidyaviewer.it4045cgroup9.dto;

public class GameDTO {

	private String title;
	private float globalRating;
	private float localRating;
	//---------------------------------	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 
	//---------------------------------
	public float getGlobalRating() {
		return globalRating;
	}
	//---------------------------------	
	public float getLocalRating() {
		return localRating;
	}
	public void setLocalRating(float localRating) {
		this.localRating = localRating;
	}
	//---------------------------------
	
}
