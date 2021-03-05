package com.example.sbwebapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyWebPageController {
	
	@RequestMapping("scorey.app")
	public String crickycall() {
		System.out.println("Cricky hompage is started!");
		return "index.html";
		
	}
	

}
