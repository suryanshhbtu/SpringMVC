package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class ContactController {
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("About");
		return "contact";
	}
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String processForm(@RequestParam("email") String email, @RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		System.out.println(email);
		System.out.println(username);
		System.out.println(password);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("username", username);
		return "processedForm";
	}
}
