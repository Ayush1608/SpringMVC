package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController 
{
	@RequestMapping("/")
	public String showHello()
	{
		return "main-menu";
	}
}
