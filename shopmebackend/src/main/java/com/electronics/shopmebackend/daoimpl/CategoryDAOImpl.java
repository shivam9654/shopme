package com.electronics.shopmebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.electronics.shopmebackend.dao.CategoryDAO;
import com.electronics.shopmebackend.dto.Category;


@Repository("CategoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	
	@Autowired
	private SessionFactory 	sessionFactory;
		
	
	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		String selectActiveCategory = "FROM Category WHERE is_active= :is_active";
		
		Query query= sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("is_active", '1');
		
		return query.getResultList();
	}



	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
		
	}



	@Override
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



	@Override
	public boolean updateCategory(Category cat) {
		// TODO Auto-generated method stub
		
		try
		{
			sessionFactory.getCurrentSession().update(cat);
			
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean deleteCategory(Category cat) {
		// TODO Auto-generated method stub
		
		cat.setSetActive('0');
		
		try
		{
			sessionFactory.getCurrentSession().update(cat);
			
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	

}
