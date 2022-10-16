package oopWithNLayeredApp_kodlamaio.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp_kodlamaio.dataAccess.CategoryDao;
import oopWithNLayeredApp_kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

	@Override
	public List<Category> list() {
		
		Category category = new Category();
		category.setId(1);
		category.setName("Programlama");
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(category);
		
		return categories;
	}

}
