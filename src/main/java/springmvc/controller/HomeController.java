package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	    List<String> list = new ArrayList<>();
	    list.add("Suryansh");
	    list.add("Yash");
	    list.add("Shivam");
	    model.addAttribute("list", list);
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
    @RequestMapping("/help")
    public ModelAndView help() {

        System.out.println("Help");
    	// Creating ModelAndView Object
    	ModelAndView modelAndView = new ModelAndView();
    	
    	// Attaching Data To View
    	modelAndView.addObject("name", "Suryansh");
    	modelAndView.addObject("id", 200106069);
    	modelAndView.addObject("time", LocalDateTime.now());
    	
    	List<Integer> marks = new ArrayList<>();
    	marks.add(100);
    	marks.add(90);
    	marks.add(93);
    	marks.add(89);
    	marks.add(70);
    	
    	modelAndView.addObject("marks", marks);
    	//Setting the View name
    	modelAndView.setViewName("help");
    	return modelAndView;
    }

}
