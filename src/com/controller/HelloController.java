package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;


@Controller
public class HelloController {
	@RequestMapping("/")
	public ModelAndView hello() {
		return new ModelAndView("registration");
	}
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute Student student)
	{
		
		return new ModelAndView("view","std",student);
		
	}
}
