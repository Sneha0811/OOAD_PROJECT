package controller;

import java.util.List;

import javax.validation.Valid;

import dao.CourseDAO;
import dao.CourseDAOImpl;


@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/list")
	public String listCourses(Model theModel)
	{
		List<Course> courses = courseService.getCourses();
		
		theModel.addAttribute("courses",courses);
		
		return "list-courses";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel)
	{
		Course course = new Course();
		
		theModel.addAttribute("course",course);
		
		return "course-form";
	}
	
	@PostMapping("/saveCourse")
	public String saveCourse(@Valid @ModelAttribute("course") Course theCourse,
							BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "course-form";
		
		}
		else {
		courseService.saveCourse(theCourse);
		return "redirect:/course/list";
		}
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("courseId") int theId, Model theModel)
	{
		//Get the course from the service
		Course theCourse = courseService.getCourse(theId);
		
		//add course to the model
		theModel.addAttribute("course", theCourse);
		
		//send over to our form
		return "course-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("courseId") int id)
	{
		courseService.deleteCourse(id);
		
		return "redirect:/course/list";
	}
	
	@GetMapping("/showStudents")
	public String showStudents(@RequestParam("courseId") int courseId, Model theModel)
	{
		List<Student> students = courseService.showStudents(courseId);
		Course course = courseService.getCourse(courseId);
		
		theModel.addAttribute("students", students);
		theModel.addAttribute("course", course);
		
		return "list-course-students";
	}

}