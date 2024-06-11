package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("One Is Called");
		return "redirect:/two";
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("Two Is Called");
		return "";
	}
}
