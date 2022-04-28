package dao;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> theQuery = currentSession.createQuery("from Student",Student.class);
		
		List<Student> students = theQuery.getResultList();
		
		return students;
	}

	@Override
	public void saveStudent(Student theStudent) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		/*
		 *saveOrUpdate(theStudent)
		 * if(primaryKey/ID) empty
		 * THEN SAVE Student
		 * ELSE UPDATE existing Student
		 */
		
		currentSession.saveOrUpdate(theStudent);
		
	}

	@Override
	public Student getStudent(int theId) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Student theStudent = currentSession.get(Student.class,theId);
		
		return theStudent;
	}

	@Override
	public void deleteStudent(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.createQuery("delete from Student where id=" + id).executeUpdate();
	}


}