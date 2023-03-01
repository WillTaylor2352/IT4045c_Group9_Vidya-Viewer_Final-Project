package com.vidyaviewer.it4045cgroup9.dto;

import java.util.List;

public class CategoryDTO {

	private int categoryID;
	private String categoryTitle; 
	private List<GameDTO> listOfGames;
	//---------------------------------	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	//---------------------------------	
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	//---------------------------------	
	public List<GameDTO> getListOfGames() {
		return listOfGames;
	}
	public void setListOfGames(List<GameDTO> listOfGames) {
		this.listOfGames = listOfGames;
	}
	//---------------------------------	
	
}
