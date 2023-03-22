package com.vidyaviewer.it4045cgroup9.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vidyaviewer.it4045cgroup9.dto.CategoryDTO;

@Component
public class CategoryStub implements ICategoryDAO {
	@Autowired
	NetworkDAO networkDAO;

	@Override
	public List<CategoryDTO> fetchCategories(String searchfilter) throws Exception {
		List<CategoryDTO> allCategories = new ArrayList<CategoryDTO>();

		allCategories.add(new CategoryDTO());
		return allCategories;
	}

}
