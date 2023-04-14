package com.vidyaviewer.it4045cgroup9.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

//Stub implementation should be done here. 
//Comment the following line to disable the component scan to the stub
//(ENSURE YOU ENABLE COMPONENT IN THE DAO IMPLEMENTATION)
@Component
public class GameStub implements IGameDAO {
	@Autowired
	NetworkDAO networkDAO;

	@Override
	public Iterable<GameDTO> fetchGames() throws Exception {
		List<GameDTO> allGames = new ArrayList<GameDTO>();

		allGames.add(new GameDTO(1, "Zelda", "5.0"));
		allGames.add(new GameDTO(2, "Forza", "4.3"));
		allGames.add(new GameDTO(3, "Horizon Zero Dawn", "4.7"));
		allGames.add(new GameDTO(4, "Jerry's Game", "1.1"));

		return allGames;
	}

	@Override
	public List<GameDTO> findGamesById(Iterable<Integer> id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(GameDTO gameDTO) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(GameDTO gameDTO) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
	}

}
