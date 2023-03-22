package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vidyaviewer.it4045cgroup9.dao.IGameDAO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IServiceDAO {

	GameDTO fetchByID(int id);

	void save(GameDTO gameDTO);

	List<GameDTO> fetchGames(String string) throws Exception;

}
