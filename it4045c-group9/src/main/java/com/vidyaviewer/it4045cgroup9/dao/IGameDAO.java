package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IGameDAO {

	public List<GameDTO> fetchGames(String searchfilter) throws Exception;

}
