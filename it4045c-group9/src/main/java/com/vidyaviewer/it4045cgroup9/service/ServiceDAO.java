package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dao.IGameDAO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

@Component
public class ServiceDAO implements IServiceDAO {

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

	@Override
	public List<GameDTO> fetchGamesService(String string) throws Exception {
		return gameDAO.fetchGames("string");
	}

}
