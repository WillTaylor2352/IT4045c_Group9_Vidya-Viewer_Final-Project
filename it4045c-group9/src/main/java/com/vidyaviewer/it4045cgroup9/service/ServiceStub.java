package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

@Component
public class ServiceStub implements IServiceDAO {
	/*
	 * any additional methods added to this class should be added to the Interface
	 * first
	 */

	public GameDTO fetchByID(int id) {
		GameDTO gameDTO = new GameDTO();
		gameDTO.setGameID(1);
		gameDTO.setTitle("Zelda");
		gameDTO.setCriticScore("5.0");
		return gameDTO;
	}

	public void save(GameDTO gameDTO) {

	}

	@Override
	public List<GameDTO> fetchGamesService(String string) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchGames'");
	}

	@Override
	public void deleteById(GameDTO gameDTO) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
	}

	@Override
	public Iterable<GameDTO> fetchAllGames() throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchAllGames'");
	}

}
