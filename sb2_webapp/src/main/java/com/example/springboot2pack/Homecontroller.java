package com.example.springboot2pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Homecontroller {

	@RequestMapping("ecomoto")
	
	public  String projectecomoto() {
	
		System.out.println("Ecomoto home page is getting called!");
		
		return "index.html";

	}

}
