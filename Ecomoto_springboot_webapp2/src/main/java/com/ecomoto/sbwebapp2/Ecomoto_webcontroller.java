package com.ecomoto.sbwebapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ecomoto_webcontroller {
	
		@RequestMapping("ecomoto.com")
		public String ecomoto_main_page() {
			System.out.println("ecomoto page is called!");
			return("index.html");
		}
		@RequestMapping("ecomoto.app")
		public String ecomoto_main_page2() {
			System.out.println("ecomoto page is called!");
			return("index.html");
		}
	         
		@RequestMapping("ecomoto.net")
		public String ecomoto_main_page3() {
			System.out.println("ecomoto page is called!");
			return("index.html");
		}
	         
		@RequestMapping("ecomoto.org")
		public String ecomoto_main_page4() {
			System.out.println("ecomoto page is called!");
			return("index.html");
		}
	         
	                                  
	}

