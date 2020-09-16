package com.electronics.shopmebackend.dao;

import java.util.List;

import com.electronics.shopmebackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> getCategories();
	
	Category getCategoryById(int id);

}
