package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

//implementation should be done here. Uncomment the following line to wire everything up
@Component
public class GameDAO implements IGameDAO {

	@Autowired
	GameRepository gameRepository;

	@Override
	public boolean save(GameDTO gameDTO) throws Exception {
		gameRepository.save(gameDTO);
		return false;
	}

	@Override
	public List<GameDTO> findGamesById(Iterable<Integer> id) throws Exception {
		return null;
	}

	@Override
	public List<GameDTO> fetchGames(String searchfilter) throws Exception {
		return null;
	}

}
