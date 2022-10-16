package oopWithNLayeredApp_kodlamaio.dataAccess.hibernate;

import oopWithNLayeredApp_kodlamaio.dataAccess.InstructorDao;
import oopWithNLayeredApp_kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}

}
