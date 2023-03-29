package com.vidyaviewer.it4045cgroup9.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.UserDTO;

@Component
public class UserDAO implements IUserDAO {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean save(UserDTO usersDTO) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(usersDTO);
		return false;
	}

}
