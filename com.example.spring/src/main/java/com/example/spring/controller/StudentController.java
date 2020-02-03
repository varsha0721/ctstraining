package com.example.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/showForm")
	public String showForm()
	{
		return "show-form";
	}
	@PostMapping("/processForm")
	public String processForm(HttpServletRequest request,Model model)
	{
		String sName=request.getParameter("sName");
		model.addAttribute("message",sName);
		return "process-form";
	}
}