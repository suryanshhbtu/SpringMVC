package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	// Method 1 : Redirect Prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("One Is Called");
		return "redirect:/two";
	}
	// Method 2 : RedirectView
	@RequestMapping("/onee")
	public RedirectView onee() {
		System.out.println("One Is Called (updated)");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com"); // '/' removed due to relative url
		return redirectView;
	}
	// Method 3 : HttpServletRequest (NOT RECOMMENDED)
	@RequestMapping("/oneee")
	public void oneee(HttpServletResponse response) throws IOException {
		System.out.println("One Is Called (updated)");
		response.sendRedirect("two");
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("Two Is Called");
		return "contact";
	}
}
