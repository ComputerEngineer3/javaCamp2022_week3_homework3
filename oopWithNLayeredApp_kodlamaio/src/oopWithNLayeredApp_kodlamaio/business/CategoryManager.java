package oopWithNLayeredApp_kodlamaio.business;

import java.util.List;

import oopWithNLayeredApp_kodlamaio.core.logging.Logger;
import oopWithNLayeredApp_kodlamaio.dataAccess.CategoryDao;
import oopWithNLayeredApp_kodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception {
		
		List<Category> categories = categoryDao.list();
		
		for(Category c:categories) {
			if(c.getName() == category.getName()) {
				throw new Exception("Kategori ismi tekrar edemez.");
			}
		}
		
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}
}
