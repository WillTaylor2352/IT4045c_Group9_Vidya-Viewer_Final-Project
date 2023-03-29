package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

public interface IUserDAO {
	
	// just adding this to follow along with tutorial
	boolean save(UserDTO usersDTO) throws Exception;
	
}
