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
	
	@Test
	public void testAddCategory()
	{
		Category cat= new Category();
		cat.setName("Washing Machine");
		cat.setDescription("Description of Washing Machine");
		cat.setImageURL("WASHINGMACHINE.png");
				
		assertEquals("Successfully saved...",true,categoryDAO.addCategory(cat));
		
	}
	
}
