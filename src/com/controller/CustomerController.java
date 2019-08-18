package com.controller;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
		
		
	}
	@RequestMapping("/showConfirmForm")
	public String showConfirmForm( @Valid @ModelAttribute ("customer") Customer customer, BindingResult bindingResult)
	{
//		System.out.println("|" + customer.getLastName()+ "|");
		System.out.println(bindingResult);
		if(bindingResult.hasErrors()){
			return "customerForm";}
		else{
		return "customerConfirmForm";}
	}

	@RequestMapping("/customerForm")
	public String showCustomerForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}
}
