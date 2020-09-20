package com.electronics.shopmebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronics.shopmebackend.dao.CategoryDAO;
import com.electronics.shopmebackend.dto.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	private SessionFactory 	sessionFactory;
	
	
	static List<Category> categories= new ArrayList<>();
	
	static {
		
		Category c1= new Category();
		c1.setId(1);
		c1.setName("Laptop");
		c1.setDescription("Description of laptop");
		c1.setImageURL("Laptop.jpg");
		
		categories.add(c1);
		
		Category c2= new Category();
		c2.setId(2);
		c2.setName("Mobile");
		c2.setDescription("Description of Mobile");
		c2.setImageURL("Mobile.jpg");
		
		categories.add(c2);
		
		Category c3= new Category();
		c3.setId(3);
		c3.setName("Television");
		c3.setDescription("Description of Television");
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



	@Override
	@Transactional
	public boolean addCategory(Category cat) {
		// TODO Auto-generated method stub
		
		try
		{
			sessionFactory.getCurrentSession().persist(cat);
			
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	

}
