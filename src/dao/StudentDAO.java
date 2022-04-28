package dao;

import java.util.List;

public interface StudentDAO {
	
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theId);

	public void deleteStudent(int id);
	
}
