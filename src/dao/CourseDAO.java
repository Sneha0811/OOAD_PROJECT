package dao;

import java.util.List;

public interface CourseDAO {
	
	public List<Course> getCourses();

	public void saveCourse(Course theCourse);

	public Course getCourse(int theId);

	public void deleteCourse(int id);

	public Instructor getInstructor(int courseId);

	public List<Course> listAddInstructorCourse();

	public List<Student> getStudents(int courseId);
	

}
