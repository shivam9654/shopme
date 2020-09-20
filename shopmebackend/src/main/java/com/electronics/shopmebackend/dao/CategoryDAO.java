package com.electronics.shopmebackend.dao;

import java.util.List;

import com.electronics.shopmebackend.dto.Category;

public interface CategoryDAO {
	
	Category getCategoryById(int id);
	
	List<Category> getCategories();
	
	boolean addCategory(Category cat);	
	
	boolean updateCategory(Category cat);	
	
	boolean deleteCategory(Category cat);

}
