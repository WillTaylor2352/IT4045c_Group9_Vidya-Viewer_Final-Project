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

	// Logger for logging
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IServiceDAO serviceDAO;

	// --------------------- HTML RETURN ENDPOINTS ---------------------

	@GetMapping("/")
	public String readindex() {
		logger.info("entering the index page (game view)");
		return "index";
	}

	@GetMapping("/games_add")
	public String addGames(Model model) {
		logger.info("entering game addition endpoint");
		model.addAttribute("gameDTO", new GameDTO());
		return "games_add";
	}

	@GetMapping("/games_update")
	public String updateGames() {
		logger.info("entering game update endpoint");
		return "games_update";
	}

	@GetMapping("/games_remove")
	public String removeGames() {
		logger.info("entering remove game endpoint");
		return "games_remove";
	}

	@GetMapping("/hellothere")
	public String helloThere() {
		logger.info("A fine addition to my collection! (entering hellothere endpoint)");
		return "hellothere";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String read(Model model) {
		logger.info("entering the test endpoint");
		model.addAttribute("gameDTO", new GameDTO());
		return "test";
	}

	// --------------------- IMPLEMENTATION ENDPOINTS ---------------------

	@RequestMapping(value = "/saveGameData")
	public String saveGameData(GameDTO gameDTO) {
		logger.info("entering the savegamedata endpoint");
		try {
			logger.info("saving gameDTO to Database: " + gameDTO.toString());
			serviceDAO.save(gameDTO);
		} catch (Exception e) {
			logger.error("error saving game", e);
			e.printStackTrace();
			return "error";
		}
		return "games_add";
	}

	@RequestMapping(value = "/searchGames", method = RequestMethod.GET)
	public String searchGames(
			@RequestParam(value = "searchTerm", required = false, defaultValue = "") String searchTerm) {
		logger.info("entering searchGames endpoint");
		String enchancedTerm = searchTerm + "";
		try {
			List<GameDTO> fetchgames = serviceDAO.fetchGamesService(enchancedTerm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ("index");
	}

}
