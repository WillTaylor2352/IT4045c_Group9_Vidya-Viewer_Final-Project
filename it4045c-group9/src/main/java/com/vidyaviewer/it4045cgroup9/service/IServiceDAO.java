package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IServiceDAO {

	GameDTO fetchByID(int id);

	void save(GameDTO gameDTO) throws Exception;

	void deleteById(GameDTO gameDTO) throws Exception;

	public Iterable<GameDTO> fetchAllGames() throws Exception;

	List<GameDTO> fetchGamesService(String string) throws Exception;

}
