package com.scorey.sbwebapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Scorey_Webcontroller {

	@RequestMapping("scorey.com")
	public String scorey_main_page() {
		System.out.println("scorey page is called!");
		return("index.html");
	}
	@RequestMapping("scorey.app")
	public String scorey_main_page2() {
		System.out.println("scorey page is called!");
		return("index.html");
	}
         
	@RequestMapping("scorey.net")
	public String scorey_main_page3() {
		System.out.println("scorey page is called!");
		return("index.html");
	}
         
	@RequestMapping("scorey.org")
	public String scorey_main_page4() {
		System.out.println("scorey page is called!");
		return("index.html");
	}
         
                                  
}
