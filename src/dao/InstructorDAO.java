package dao;

import java.util.List;

public interface InstructorDAO {
	
	public List<Instructor> getInstructors();

	public void saveInstructor(Instructor theInstructor);

	public Instructor getInstructor(int theId);

	public void deleteInstructor(int id);

}
