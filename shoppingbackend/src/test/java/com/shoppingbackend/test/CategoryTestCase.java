package com.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackend.dao.CategoryDAO;
import com.shoppingbackend.dto.Category;


public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	 /* @Test public void testAddCategory() {
	  
	  category = new Category();
	  
	  category.setName("Television");
	  category.setDescription("This is some description for television !");
	  category.setImageURL("CAT_1.png");
	  
	 assertEquals("SucssesFully added a category inside the table!",true,
	 categoryDAO.add(category));
	 
	 
	 }*/
	 
	
	/* @Test public void testGetCategory() {
	  
	  category = categoryDAO.get(3);
	  
	  assertEquals("SucssesFully fetched a single category from the table!","Television",category.getName());
	  
	  }
	 */

	
	 /* @Test public void testUpdateCategory() {
	  
	  category = categoryDAO.get(3);
	  
	  category.setName("TV");
	  
	  assertEquals("SucssesFully Update a single category in the table!",true,
	  categoryDAO.update(category));
	  
	  }
	 */

	
	 @Test public void testDeleteCategory() {
	  
	  category = categoryDAO.get(3);
	  assertEquals("SucssesFully deleted a single category in the table!",true,
	 categoryDAO.delete(category));
	  
	  }
	 

	
	  @Test public void testListCategory() {
	  
	  assertEquals("SucssesFully fetched the list of  categories from the table!",3,categoryDAO.list().size());
	  
	 }
	 
	@Test
	public void testCRUDCategory() {

		// add operation
		category = new Category();

		category.setName("Laptop");
		category.setDescription("This is some description for Laptop !");
		category.setImageURL("CAT_1.png");

		assertEquals("SucssesFully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Television");
		category.setDescription("This is some description for television !");
		category.setImageURL("CAT_2.png");

		assertEquals("SucssesFully added a category inside the table!", true, categoryDAO.add(category));

		// fetching and updating the category
		category = categoryDAO.get(2);

		category.setName("TV");

		assertEquals("SucssesFully Update a single category in the table!", true, categoryDAO.update(category));

		// delete the category

		assertEquals("SucssesFully deleted a single category in the table!", true, categoryDAO.delete(category));

		// fetching the list
		assertEquals("SucssesFully fetched a single category from the table!", "Television", category.getName());
	}

}
