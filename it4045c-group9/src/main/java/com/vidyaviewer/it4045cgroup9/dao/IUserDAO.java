package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

public interface IUserDAO {
//CREATE OPS----------------------------------
	// id will be decided by persistent storage when record is added
	public UserDTO createUser(String aUsername, String anEmail, String aPassword);
	public void addCategoryToProfile(int categoryID);
	public void addFriendToProfile(int userID);
//READ OPS------------------------------------
	public UserDTO getUserByID(int id);
	public List<CategoryDTO> loadMyCategories() throws NullPointerException;
//UPDATE OPS----------------------------------
	public void changeMyUserName(String newUserName);
	public void changeMyPassword(String newPassword);
	public void changeMyEmail(String newEmail);
//DELETE OPS----------------------------------
	public void deleteUserDetails(int userID);
	public void deleteUserCategory(int categoryID);
	
}
