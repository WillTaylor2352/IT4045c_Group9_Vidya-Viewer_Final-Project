package com.vidyaviewer.it4045cgroup9.dto;

import java.util.List;

public class UserDTO {

	private int userID;
	private String userName;
	private String email;
	private String password;
	private List<UserDTO> listOfFriends;
	private List<CategoryDTO> categories;
//USERID---------------------------------	
	public int getUserID() {
		return userID;
	}
//USERNAME---------------------------------	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
//EMAIL---------------------------------	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//PASSWORD---------------------------------	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//FRIENDS---------------------------------	
	public List<UserDTO> getListOfFriends() {
		return listOfFriends;
	}
	public void setListOfFriends(List<UserDTO> listOfFriends) {
		this.listOfFriends = listOfFriends;
	}
//CATEGORIES---------------------------------	
	public List<CategoryDTO> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
	//---------------------------------	
	
}
