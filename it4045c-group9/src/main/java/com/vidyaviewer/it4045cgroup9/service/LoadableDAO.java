package com.vidyaviewer.it4045cgroup9.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidyaviewer.it4045cgroup9.dao.IGameDAO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public class LoadableDAO implements ILoadableDAO {

	@Autowired
	IGameDAO gameDAO;

	@Override
	public GameDTO fetchByID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchByID'");
	}

	@Override
	public void save(GameDTO gameDTO) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}
}
