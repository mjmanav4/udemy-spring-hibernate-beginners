package com.manavjain.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processForm2")
	public String letsShout(HttpServletRequest req, Model model) {
		
		String name = req.getParameter("studentName");
		name = name.toUpperCase();
		
		model.addAttribute("message",name);
		
		return "helloworld";
	}
	
}
