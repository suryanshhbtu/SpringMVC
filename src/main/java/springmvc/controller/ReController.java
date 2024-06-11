package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("One Is Called (updated)");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com"); // '/' removed due to relative url
		return redirectView;
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("Two Is Called");
		return "contact";
	}
}
