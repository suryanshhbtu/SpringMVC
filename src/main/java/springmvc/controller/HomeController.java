package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	static {
    System.out.println("HOME");
	}
	@RequestMapping("/home")
	public String home(Model model) {
	    System.out.println("HOME");
	    model.addAttribute("name", "Suryansh");
	    model.addAttribute("id", 200106069);
	    return "home"; // Ensure this returns the correct view name
	}
    @RequestMapping("/about")
    public String about() {
        return "about";
    }
    @RequestMapping("/*")
    public String handleUnmappedRequests() {
        System.out.println("No mapping found for the request");
        return "error"; // Ensure you have an error.jsp in /WEB-INF/views/
    }
}
