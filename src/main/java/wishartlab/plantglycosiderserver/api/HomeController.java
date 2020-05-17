package wishartlab.plantglycosiderserver.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// The value of the name parameter is added to a Model object, 
	// ultimately making it accessible to the view template.
	@GetMapping("/")
	public String greeting(Model model) {
		
		// render server side variable to thymeleaf page 
		// model.addAttribute("name", name);
		// <p th:text="'Hello, ' + ${name} + '!'" />
		
		
		return "home";
	}
}
