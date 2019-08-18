package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/showForm")
	public String getHelloForm()
	{
		return "helloWorld-form";
	}
	
	@RequestMapping("/prepareForm")
	public String displayNameInUpper(HttpServletRequest req, Model model)
	{
		String name = req.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "displayName";
	}
	
	@RequestMapping("/prepareFormVersionTwo")
	public String displayNameInUpperVersionTwo(@RequestParam("studentName") String name, Model model)
	{
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "displayName";
	}
}
