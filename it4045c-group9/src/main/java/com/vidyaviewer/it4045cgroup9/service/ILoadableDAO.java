package com.vidyaviewer.it4045cgroup9.service;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface ILoadableDAO {

	GameDTO fetchByID(int id);

	void save(GameDTO gameDTO);
}
