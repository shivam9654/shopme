package com.electronics.shopmebackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.electronics.shopmebackend.dao.CategoryDAO;
import com.electronics.shopmebackend.dto.Category;

public class CategoryTest {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private static Category category;
	
	
	@BeforeClass
	public static void init()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.electronics.shopmebackend");
		context.refresh();
		
		categoryDAO= (CategoryDAO) context.getBean("CategoryDAO");
		
		
	}
	/*
	@Test
	public void testAddCategory()
	{
		Category cat= new Category();
		cat.setName("Washing Machine");
		cat.setDescription("Description of Washing Machine");
		cat.setImageURL("WASHINGMACHINE.png");
				
		assertEquals("Successfully saved...",true,categoryDAO.addCategory(cat));
		
	}
	
	*/
	/*
	@Test
	public void testgetCategory()
	{
		Category cat= categoryDAO.getCategoryById(3);
		
		assertEquals("Category succesfully retrived",cat.getName(),"Mobile");
		
	}
	
	*/
	
	
	/*

	@Test
	public void testupdateCategory()
	{
		Category cat= categoryDAO.getCategoryById(3);
		
		cat.setName("Mobile");
		
		categoryDAO.updateCategory(cat);
		
		cat= categoryDAO.getCategoryById(3);
		
		
		assertEquals("Category succesfully updated",cat.getName(),"Mobile");
		
	}
	
	*/
	
	/*
	
	@Test
	public void testgetCategories()
	{
	
		
		assertEquals("Successfully retived all the categories ",3,categoryDAO.getCategories().size());
	}
	
	*/
	
	
	
	
}
