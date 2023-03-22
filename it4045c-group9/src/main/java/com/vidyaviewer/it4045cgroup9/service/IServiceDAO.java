package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IServiceDAO {

	GameDTO fetchByID(int id);

	void save(GameDTO gameDTO);

	List<GameDTO> fetchGamesService(String string) throws Exception;

}
