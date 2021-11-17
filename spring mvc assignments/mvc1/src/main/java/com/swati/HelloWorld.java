package com.swati;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping("/hello Swati Raj")
	public String add() {
	
		return "helloWorld.jsp";
	
	}
}