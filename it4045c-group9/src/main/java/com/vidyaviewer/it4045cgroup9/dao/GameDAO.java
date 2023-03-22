package com.vidyaviewer.it4045cgroup9.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

@Component
public class GameDAO implements IGameDAO {

	@Autowired
	NetworkDAO networkDAO;

	@Override
	public List<GameDTO> fetch(String searchfilter) throws Exception {
		List<GameDTO> allGames = new ArrayList<GameDTO>();

		// TODO REPLACE THE BASEURL WITH THE CONNECTIONSTRING FOR THE JSON DATA
		String rawJson = networkDAO.request("baseurl" + searchfilter);

		JSONObject root = new JSONObject(rawJson);

		JSONArray games = root.getJSONArray("jsonarray returned from baseurl");

		for (int i = 0; i < games.length(); i++) {
			JSONObject jsonGames = games.getJSONObject(i);
			GameDTO game = new GameDTO();
			// NOTE: THE STRINGS HERE SHOULD MATCH TO THE IDENTIFIERS FOUND WITHIN THE
			// RETURNED JSON ARRAY
			game.setGameID(jsonGames.getInt("id"));
			game.setTitle(jsonGames.getString("title"));
			game.setCriticScore(jsonGames.getDouble("criticScore"));
			
			allGames.add(game);
		}

		return allGames;
	}

}
