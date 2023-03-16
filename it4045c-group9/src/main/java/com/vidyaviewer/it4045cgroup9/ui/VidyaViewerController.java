package com.vidyaviewer.it4045cgroup9.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	@GetMapping("/")
	public String readindex() {
		return "index";
	}

	@GetMapping("/start")
	public String start() {
		return "start";
	}

	@GetMapping("/hellothere")
	public String hellothere() {
		return "hellothere";
	}

}
