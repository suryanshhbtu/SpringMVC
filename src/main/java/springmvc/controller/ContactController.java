package springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.entity.User;
import springmvc.service.UserService;

@Controller
@RequestMapping("/api")
@ComponentScan("springmvc")
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModels(Model model) {
		model.addAttribute("heading", "This is Heading.");
		model.addAttribute("description", "This is My Description.");
	}
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("About");
		return "contact";
	}
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model model) {
		System.out.println(user+" User Saved Successfully");
		userService.createUser(user);
		return "processedForm";
	}
}
