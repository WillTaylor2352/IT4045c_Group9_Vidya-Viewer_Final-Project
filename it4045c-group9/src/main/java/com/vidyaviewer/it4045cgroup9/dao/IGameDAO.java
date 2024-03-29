package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IGameDAO {

	public List<GameDTO> findGamesById(Iterable<Integer> id) throws Exception;

	boolean save(GameDTO gameDTO) throws Exception;

	public boolean deleteById(GameDTO gameDTO);

	public Iterable<GameDTO> fetchGames() throws Exception;

}
