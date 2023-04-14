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

	/**
	 * Saves a GameDTO into the database
	 * 
	 * @param gameDTO - the game object to save in the database
	 * @return boolean
	 * @throws Exception - occurs when there is an error writing an object to the
	 *                   database
	 */
	@Override
	public boolean save(GameDTO gameDTO) throws Exception {
		gameRepository.save(gameDTO);
		return false;
	}

	/**
	 * Deletes a GameDTO from the database by ID
	 * 
	 * @param gameDTO - the game object to remove from the database
	 * @return boolean
	 */
	@Override
	public boolean deleteById(GameDTO gameDTO) {
		gameRepository.deleteById(gameDTO.getGameID());
		return false;
	}

	/**
	 * Returns Iterable of GameDTO objects.
	 * 
	 * @return Iterable<GameDTO>
	 * @throws Exception
	 */
	@Override
	public Iterable<GameDTO> fetchGames() throws Exception {
		return gameRepository.findAll();
	}

	@Override
	public List<GameDTO> findGamesById(Iterable<Integer> id) throws Exception {
		return null;
	}

}
