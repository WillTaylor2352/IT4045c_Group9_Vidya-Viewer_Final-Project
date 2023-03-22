package com.vidyaviewer.it4045cgroup9.dao;

import java.util.List;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;
import com.vidyaviewer.it4045cgroup9.dto.GameDTO;

public interface ICategoryDAO {
	public List<CategoryDTO> fetchCategories(String searchfilter) throws Exception;
}
