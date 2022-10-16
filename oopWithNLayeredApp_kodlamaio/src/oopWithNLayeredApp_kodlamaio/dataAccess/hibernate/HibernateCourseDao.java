package oopWithNLayeredApp_kodlamaio.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredApp_kodlamaio.dataAccess.CourseDao;
import oopWithNLayeredApp_kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

	@Override
	public List<Course> list() {
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setInstructorId(1);
		course1.setCategoryId(1);
		course1.setName("C#");
		course1.setDescription("Yazılım Geliştirici Yetiştirme Kampı");
		course1.setImageUrl("c#.png");
		course1.setUnitPrice(25);
		
		Course course2 = new Course();
		course2.setId(2);
		course2.setInstructorId(1);
		course2.setCategoryId(1);
		course2.setName("Java");
		course2.setDescription("Yazılım Geliştirici Yetiştirme Kampı");
		course2.setImageUrl("java.png");
		course2.setUnitPrice(30);
	
		Course course3 = new Course();
		course3.setId(3);
		course3.setInstructorId(1);
		course3.setCategoryId(1);
		course3.setName("JavaScript");
		course3.setDescription("Yazılım Geliştirici Yetiştirme Kampı");
		course3.setImageUrl("javascript.png");
		course3.setUnitPrice(15);
		
		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		
		return courses;
	}
	
}
