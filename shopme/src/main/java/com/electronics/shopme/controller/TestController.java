package com.electronics.shopme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/abc")
	public void abc()
	{
		System.out.println("Inside abc");
	}

}
