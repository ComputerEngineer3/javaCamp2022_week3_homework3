package oopWithNLayeredApp_kodlamaio.dataAccess.jdbc;

import oopWithNLayeredApp_kodlamaio.dataAccess.InstructorDao;
import oopWithNLayeredApp_kodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi.");
	}
}
