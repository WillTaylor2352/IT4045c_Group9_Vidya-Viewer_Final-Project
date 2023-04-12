package com.vidyaviewer.it4045cgroup9.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;
import com.vidyaviewer.it4045cgroup9.service.IServiceDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class VidyaViewerController {
	/*
	 * TODO - IMPLEMENT METHODS FOR THE FOLLOWING REQUESTS:
	 * 
	 * Get allRatings
	 * Get myRatings
	 * Get allGames
	 * Get allCategories
	 * Get filteredCategories
	 * Get userAccount
	 * Get myFriends
	 * Get errorPage
	 * Post addGame
	 * Post addMyCategory
	 * Post shareGame
	 * Post shareCategory
	 * Post addMyRating
	 */
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IServiceDAO serviceDAO;

	@RequestMapping(value = "saveGameData")
	public String saveGameData(GameDTO gameDTO) {
		gameDTO.setGameID(1);
		gameDTO.setTitle("Overwatch 2");
		gameDTO.setCriticScore("3.5");
		try {
			serviceDAO.save(gameDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("error saving game", e);
			e.printStackTrace();
			return "error";
		}
		return "test";
	}

	@GetMapping("/")
	public String readindex() {
		return "index";
	}

	@GetMapping("/games")
	public String loadGames() {
		return "games";
	}

	@GetMapping("/hellothere")
	public String helloThere() {
		return "hellothere";
	}

	@GetMapping("/profile")
	public String showProfile() {
		return "profile";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String read(Model model) {
		model.addAttribute("gameDTO", new GameDTO());
		return "test";
	}

	@RequestMapping(value = "/searchGames", method = RequestMethod.GET)
	public String searchGames(
			@RequestParam(value = "searchTerm", required = false, defaultValue = "") String searchTerm) {
		String enchancedTerm = searchTerm + "";
		try {
			List<GameDTO> fetchgames = serviceDAO.fetchGamesService(enchancedTerm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ("index");
	}

}
