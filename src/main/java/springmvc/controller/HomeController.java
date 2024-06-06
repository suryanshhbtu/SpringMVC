package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("HOME");
        return "home";
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
