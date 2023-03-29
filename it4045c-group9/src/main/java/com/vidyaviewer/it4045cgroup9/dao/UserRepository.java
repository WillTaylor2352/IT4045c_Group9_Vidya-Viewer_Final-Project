package com.vidyaviewer.it4045cgroup9.dao;

import org.springframework.data.repository.CrudRepository;

import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, Integer> {
	
	
	
}
