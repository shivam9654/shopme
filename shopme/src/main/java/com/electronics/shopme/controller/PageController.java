package com.electronics.shopme.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.electronics.shopme.test.TempString;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/home","/","index"})
	public ModelAndView index()
	{
		System.out.println("Hey!!");
		
		ModelAndView mv= new ModelAndView("page");
		
		mv.addObject("greeting", "Welcome to the Spring Web MVC");
		
		return mv;
		
	}
	
	
	
//	@RequestMapping("/test1")
//	public String test1(@ModelAttribute("greeting") TempString greeting )
//	{
//		/*
//		 	http://localhost:8080/shopme/test1?name=shivam
//		 	String test1(@ModelAttribute("name") String name ) does not work...
//		 	because name.setname() does not exist.
//		 */
//		System.out.println("Hi "+ greeting.getName());
//		return "page";
//	}
	
//	@RequestMapping("/test2")
//	public ModelAndView test2(@RequestParam("greeting") String greeting )
//	{
//		System.out.println("Hi");
//		ModelAndView mv= new ModelAndView("page");
//		
//		mv.addObject("greeting", greeting);
//		
//		return mv;
//	}
	
//	@RequestMapping("/test2/{name}")
//	public ModelAndView test2(@PathVariable("name") String myName )
//	{
//		System.out.println("Hi");
//		ModelAndView mv= new ModelAndView("page");
//		
//		mv.addObject("greeting", myName);
//		
//		return mv;
//	}
	
	
		
}
