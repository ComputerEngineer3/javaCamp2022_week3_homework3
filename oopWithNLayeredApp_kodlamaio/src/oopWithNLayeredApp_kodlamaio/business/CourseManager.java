package oopWithNLayeredApp_kodlamaio.business;

import java.util.List;

import oopWithNLayeredApp_kodlamaio.core.logging.Logger;
import oopWithNLayeredApp_kodlamaio.dataAccess.CourseDao;
import oopWithNLayeredApp_kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception {
		
		List<Course> courses = courseDao.list();
		
		for(Course c:courses) {
			if(c.getName() == course.getName()) {
				throw new Exception("Kurs ismi tekrar edemez.");
			}
		}
		
		if(course.getUnitPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
		}
		
		courseDao.add(course);
		
		for(Logger logger:loggers) {
			logger.log(course.getName());
		}
	}
}
