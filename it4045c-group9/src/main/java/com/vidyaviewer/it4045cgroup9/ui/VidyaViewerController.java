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

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IServiceDAO serviceDAO;

	@RequestMapping(value = "/saveGameData")
	public String saveGameData(GameDTO gameDTO) {
		// CURRENTLY HARDCODED, ENSURE PASSING IN VARIABLES FROM TEXT FIELDS
		gameDTO.setGameID(1);
		gameDTO.setTitle("Overwatch 2");
		gameDTO.setCriticScore("3.5");
		try {
			log.info("saving gameDTO to Database: " + gameDTO.toString());
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

	@GetMapping("/games_add")
	public String addGames() {
		return "games_add";
	}

	@GetMapping("/games_update")
	public String updateGames() {
		return "games_update";
	}

	@GetMapping("/games_remove")
	public String removeGames() {
		return "games_remove";
	}

	@GetMapping("/hellothere")
	public String helloThere() {
		return "hellothere";
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
