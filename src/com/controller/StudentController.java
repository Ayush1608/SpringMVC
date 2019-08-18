package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@RequestMapping("/showConfirmForm")
	public String showConfirmForm(@ModelAttribute("student") Student student)
	{
		return "studentConfirmForm";
	}
	
	@RequestMapping("/studentForm")
	public String showStudentForm(Model model)
	{
		model.addAttribute(new Student());
		return "studentForm";
	}
}
