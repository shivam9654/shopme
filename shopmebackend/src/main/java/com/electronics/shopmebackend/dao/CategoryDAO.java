package com.electronics.shopmebackend.dao;

import java.util.List;

import com.electronics.shopmebackend.dto.Category;

public interface CategoryDAO {
	
	boolean addCategory(Category cat);
	
	List<Category> getCategories();
	
	Category getCategoryById(int id);

}
