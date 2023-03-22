package com.vidyaviewer.it4045cgroup9.dto;

import java.util.List;

public class UserDTO {

	private int userID;
	private String userName;
	private String email;
	private String password;

	// instantiation constructor
	public UserDTO() {
	}

	// this constructor used to set the basic data for a user. List of friends and
	// list of games should be pulled from the DB and should be considered nullable.
	public UserDTO(int userID, String username, String email, String password) {
		this.userID = userID;
		this.userName = username;
		this.email = email;
		this.password = password;
	}

	// USERID---------------------------------
	public int getUserID() {
		return userID;
	}

	// USERNAME---------------------------------
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	// EMAIL---------------------------------
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// PASSWORD---------------------------------
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
