package com.vidyaviewer.it4045cgroup9.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String readindex(Model model) {
		logger.info("entering the index page (game view)");
		model.addAttribute("gameDTO", new GameDTO());
		return "index";
	}

	@GetMapping("/games_add")
	public String addGames(Model model) {
		logger.info("entering game addition endpoint");
		model.addAttribute("gameDTO", new GameDTO());
		return "games_add";
	}

	@GetMapping("/games_update")
	public String updateGames(Model model) {
		logger.info("entering game update endpoint");
		model.addAttribute("gameDTO", new GameDTO());
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

	/**
	 * SaveGameData method - Local method used to perform crud save operation
	 * 
	 * @param gameDTO - the game dto to write to the database
	 * @return boolean - returns false if operation fails, returns true if
	 *         successful
	 */
	public boolean saveGameData(GameDTO gameDTO) {
		try {
			serviceDAO.save(gameDTO);
			logger.info("saved gameDTO to Database: " + gameDTO.toString());
		} catch (Exception e) {
			logger.error("error saving game", e);
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * Adds a game to the database
	 * 
	 * @param gameDTO - the gameDTO to add to the database
	 * @return String
	 */
	@RequestMapping(value = "/addGameData")
	public String addGameData(GameDTO gameDTO) {
		logger.info("entering the addgamedata endpoint");
		if (saveGameData(gameDTO))
			return "games_add";
		else
			return "error";
	}

	/**
	 * Updates a selected game by ID
	 * 
	 * @param gameDTO - the game object passed in by thymeleaf
	 * @param gameID  - the gameID to be updated
	 * @return String - the view returned after process completes
	 */
	@RequestMapping(value = "/updateGameData", params = "action=update")
	public String updateGameData(GameDTO gameDTO) {
		logger.info("entering the updategamedata endpoint");
		if (saveGameData(gameDTO))
			return "games_update";
		else
			return "error";
	}

	/**
	 * Cancels the requested update to game data and returns user to homepage
	 * 
	 * @return String - the view being returned to the user
	 */
	@RequestMapping(value = "/updateGameData", params = "action=cancel")
	public String cancelUpdateGameData(GameDTO gameDTO) {
		return "index";
	}

	// TODO SET UP TO PASS GAMEDTO TO UPDATE GAME DATA. FIGURE OUT HOW TO DISABLE
	// TEXT FIELD ON GAMEID
	@RequestMapping(value = "/gameControls", params = "action=edit")
	public String editGameData(GameDTO gameDTO) {
		return "updateGameData";
	}

	// TODO SET UP TO PASS GAMEDTO TO UPDATE GAME DATA. FIGURE OUT HOW TO DISABLE
	// TEXT FIELD ON GAMEID
	@RequestMapping(value = "/gameControls", params = "action=delete")
	public String deleteGameData(GameDTO gameDTO) {
		return "index";
	}

	@RequestMapping(value = "/removeGameData")
	public String removeGameData(GameDTO gameDTO) {
		logger.info("entering the updategamedata endpoint");
		try {
			serviceDAO.deleteById(gameDTO);
			logger.info("saved gameDTO to Database: " + gameDTO.toString());
		} catch (Exception e) {
			logger.error("error saving game", e);
			e.printStackTrace();
			return "error";
		}
		return "games_remove";

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

	@RequestMapping(value = "/loadGames", method = RequestMethod.GET)
	public ModelAndView loadgames() {
		ModelAndView modelAndView = new ModelAndView();
		try {
			Iterable<GameDTO> allgames = serviceDAO.fetchAllGames();
			logger.info("games fetched sucessfully!");
			modelAndView.setViewName("index");
			modelAndView.addObject("allgames", allgames);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("failed to fetch games", e);
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

}
