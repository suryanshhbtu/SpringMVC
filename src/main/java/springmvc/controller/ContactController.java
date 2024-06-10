package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class ContactController {
	
	@RequestMapping("/contact")
	public String contact() {
		System.out.println("About");
		return "contact";
	}
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public void processForm(HttpServletRequest req) {
		System.out.println("processForm");
		System.out.println("Your Email is : "+req.getParameter("email"));
		System.out.println("Your User Name is : "+req.getParameter("username"));
		System.out.println("Your Password is : "+req.getParameter("password"));
			
		return;
	}
}
