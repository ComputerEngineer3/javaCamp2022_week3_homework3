package oopWithNLayeredApp_kodlamaio.dataAccess;

import java.util.List;

import oopWithNLayeredApp_kodlamaio.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> list();
}
