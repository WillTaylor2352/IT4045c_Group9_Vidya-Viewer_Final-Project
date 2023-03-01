package com.vidyaviewer.it4045cgroup9.dto;

import java.util.List;

public class UserDTO {

	private String userName;
	private boolean isMe;
	private String email;
	private List<UserDTO> listOfFriends;
	private List<CategoryDTO> categories;
	//---------------------------------	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	//---------------------------------	
	public boolean isMe() {
		return isMe;
	}
	public void setMe(boolean isMe) {
		this.isMe = isMe;
	}
	//---------------------------------	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//---------------------------------	
	public List<UserDTO> getListOfFriends() {
		return listOfFriends;
	}
	public void setListOfFriends(List<UserDTO> listOfFriends) {
		this.listOfFriends = listOfFriends;
	}
	//---------------------------------	
	public List<CategoryDTO> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDTO> categories) {
		this.categories = categories;
	}
	//---------------------------------	
	
}
