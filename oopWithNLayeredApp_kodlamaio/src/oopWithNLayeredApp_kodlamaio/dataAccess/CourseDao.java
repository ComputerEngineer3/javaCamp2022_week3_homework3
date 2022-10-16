package oopWithNLayeredApp_kodlamaio.dataAccess;

import java.util.List;

import oopWithNLayeredApp_kodlamaio.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> list();
}
