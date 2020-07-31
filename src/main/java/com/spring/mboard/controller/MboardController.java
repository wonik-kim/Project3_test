package com.spring.mboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MboardController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("두번쨰 커밋이여!");
		
		return "home";
	}
	
	
	
}
