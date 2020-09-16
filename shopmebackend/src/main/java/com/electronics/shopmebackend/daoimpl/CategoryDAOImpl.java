package com.electronics.shopmebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.electronics.shopmebackend.dao.CategoryDAO;
import com.electronics.shopmebackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	static List<Category> categories= new ArrayList<>();
	
	static {
		
		Category c1= new Category();
		c1.setId(1);
		c1.setName("Laptop");
		c1.setDesctiption("Description of laptop");
		c1.setImageURL("Laptop.jpg");
		
		categories.add(c1);
		
		Category c2= new Category();
		c2.setId(2);
		c2.setName("Mobile");
		c2.setDesctiption("Description of Mobile");
		c2.setImageURL("Mobile.jpg");
		
		categories.add(c2);
		
		Category c3= new Category();
		c3.setId(3);
		c3.setName("Television");
		c3.setDesctiption("Description of Television");
		c3.setImageURL("Television.jpg");
		
		categories.add(c3);
		
		
	}
	
	
	
	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<categories.size();i++)
		{
			if(categories.get(i).getId()==id)
			{
				return categories.get(i);
			}
		}
			
		return null;
		
	}
	
	

}
