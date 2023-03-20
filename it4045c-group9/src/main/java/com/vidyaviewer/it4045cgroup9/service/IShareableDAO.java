package com.vidyaviewer.it4045cgroup9.service;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;
import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

public interface IShareableDAO {
	GameDTO fetchGameByID(int id);

	void shareGame(GameDTO gameDTO, UserDTO targetUser);

	CategoryDTO fetchCategoryByID(int id);

	void shareCategory(CategoryDTO categoryDTO, UserDTO targetUser);

	UserDTO fetchUserByID(int id);

	void shareUser(UserDTO userDTO, UserDTO targetUser);

}
