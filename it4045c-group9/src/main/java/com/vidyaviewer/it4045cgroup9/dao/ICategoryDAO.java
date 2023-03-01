package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface ICategoryDAO {
//CREATE OPS-----------------------------
	// id will be decided by persistent storage when record is added
	public CategoryDTO createCategory(String aCategoryTitle);
//READ OPS-------------------------------
	public List<GameDTO> getGamesByCategoryID(int categoryID);
//UPDATE OPS-----------------------------
	// games created by the GameDAO will be added through the CategoryDAO
	public void addGameToCategoryByID(int gameID, int categoryID) throws NullPointerException;
	public void removeGameFromCategoryByID(int gameID); 
//DELETE OPS------------------------------
	//should delete all the categories and related games
	public void deleteCategoryAndGamesByCategoryID(int categoryID);
	//should only delete the category, leaving the games intact
	public void deleteCategoryByID(int categoryID);

}
