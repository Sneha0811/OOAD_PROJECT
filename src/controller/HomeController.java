package controller;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/menu")
	public String showPage()
	{
		return "main-menu";
	}

}