package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.entity.User;

@Controller
@RequestMapping("/api")
public class ContactController {
	
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
		System.out.println(user+" edited ____ ");
		model.addAttribute("description", "This is Child My Description.");
		return "processedForm";
	}
}
