package com.vidyaviewer.it4045cgroup9.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;
import com.vidyaviewer.it4045cgroup9.service.ILoadableDAO;
import com.vidyaviewer.it4045cgroup9.service.IShareableDAO;
import com.vidyaviewer.it4045cgroup9.service.LoadableStub;
import com.vidyaviewer.it4045cgroup9.service.ShareableStub;

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
	@Autowired
	private ILoadableDAO loadableService;

	@Autowired
	private IShareableDAO sharableStub;

	@RequestMapping(value = "saveGameData")
	public String saveGameData(GameDTO gameDTO) {
		gameDTO.setGameID(2);
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
		return ("hellothere");
	}

}
