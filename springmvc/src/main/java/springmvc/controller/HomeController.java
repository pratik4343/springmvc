package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
	
		System.out.println("incognito mode");

		
		return "index";
	}
	
	
	
	@RequestMapping("/about")
	public void about() {
	
		System.out.println("this is about page");

		
	}
	
	
	
}
