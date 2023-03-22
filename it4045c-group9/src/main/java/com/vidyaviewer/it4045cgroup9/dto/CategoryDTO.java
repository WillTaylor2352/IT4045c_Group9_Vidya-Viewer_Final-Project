package com.vidyaviewer.it4045cgroup9.dto;

public class CategoryDTO {

	private int categoryID;
	private String title;

	public CategoryDTO() {
	}

	// This constructor used to set the basic data for a category, List of games
	// should be pulled from the DB
	public CategoryDTO(int categoryID, String title) {

	}

	// ---------------------------------
	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	// ---------------------------------
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
