package com.vidyaviewer.it4045cgroup9.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dao.IGameDAO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;
import com.vidyaviewer.it4045cgroup9.ui.VidyaViewerController;

@Component
public class ServiceDAO implements IServiceDAO {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IGameDAO gameDAO;

	@Override
	public GameDTO fetchByID(int id) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'fetchByID'");
	}

	@Override
	public void save(GameDTO gameDTO) throws Exception {
		logger.info("entering save method in ServiceDAO");
		gameDAO.save(gameDTO);
	}

	@Override
	public List<GameDTO> fetchGamesService(String string) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public GameDTO findGameById( Iterable<Integer> id ) {
	 * return gameDAO.findGamesById(id);
	 * }
	 */

	/*
	 * @Override
	 * public List<GameDTO> fetchGamesService(String string) throws Exception {
	 * return gameDAO.findGamesById("string");
	 * }
	 */

}
