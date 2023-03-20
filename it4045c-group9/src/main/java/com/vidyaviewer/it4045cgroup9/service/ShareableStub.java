package com.vidyaviewer.it4045cgroup9.service;

import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;
import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

@Component
public class ShareableStub implements IShareableDAO {

	@Override
	public GameDTO fetchGameByID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchGameByID'");
	}

	/**
	 * This method used to pass a game object to a target user
	 */
	@Override
	public void shareGame(GameDTO gameDTO, UserDTO targUser) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'shareGame'");
	}

	@Override
	public CategoryDTO fetchCategoryByID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchCategoryByID'");
	}

	/**
	 * This method used to pass a category to a target user
	 */
	@Override
	public void shareCategory(CategoryDTO categoryDTO, UserDTO targUser) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'shareCategory'");
	}

	@Override
	public UserDTO fetchUserByID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchUserByID'");
	}

	/**
	 * This method used to pass a user profile to a target user
	 */
	@Override
	public void shareUser(UserDTO userDTO, UserDTO targUser) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'shareUser'");
	}
	/*
	 * any additional methods added to this class should be added to the Interface
	 * first
	 */

}
