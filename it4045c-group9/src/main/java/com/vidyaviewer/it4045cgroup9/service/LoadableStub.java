package com.vidyaviewer.it4045cgroup9.service;

import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

@Component
public class LoadableStub implements ILoadableDAO {
	/*
	 * any additional methods added to this class should be added to the Interface
	 * first
	 */

	public GameDTO fetchByID(int id) {
		GameDTO gameDTO = new GameDTO();
		gameDTO.setGameID(1);
		gameDTO.setTitle("Zelda");
		gameDTO.setMyRating(5);
		gameDTO.setUserDescription("This game was so much fun to play");
		return gameDTO;
	}

	public void save(GameDTO gameDTO) {

	}

}
