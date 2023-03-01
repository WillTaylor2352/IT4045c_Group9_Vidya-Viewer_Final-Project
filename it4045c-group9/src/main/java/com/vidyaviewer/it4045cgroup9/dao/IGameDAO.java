package com.vidyaviewer.it4045cgroup9.dao;

import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface IGameDAO  {
//CREATE OPS----------------------------------
	// id will be decided by persistent storage when record is added 
	public void createGame(String aTitle, String aDescription, float aTwoDigitDecimalNumber, int aCategoryIDtoInsertInto);
//READ OPS------------------------------------	
	public GameDTO getGameByID(int gameID);
//UPDATE OPS----------------------------------
	public void editMyDescription(String newDescription);
	public void editMyRating(float newRating);
//DELETE OPS----------------------------------
	public void deleteGameByID(int gameID);
	
}
