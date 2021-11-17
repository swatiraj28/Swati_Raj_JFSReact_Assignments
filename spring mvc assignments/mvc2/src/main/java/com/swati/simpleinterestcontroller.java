package com.swati;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class simpleinterestcontroller {
	
	@RequestMapping("/")
	public String landingPage() {
	
		return "SimpleInterest.jsp";
	
	}
	
	@RequestMapping("/calculate")
	public ModelAndView calculateIntrest(HttpServletRequest request, HttpServletResponse response) {
		
		double principal = Double.parseDouble(request.getParameter("pamount"));
		double noYear = Double.parseDouble(request.getParameter("noyear"));
		double rateOfInterest = Double.parseDouble(request.getParameter("intrest"));
		double simpleInterest = ((principal*noYear*rateOfInterest)/100);
		
		ModelAndView mav = new ModelAndView("ResultDisplay.jsp");
//		mav.setViewName("ResultDisplay.jsp");
		mav.addObject("result", simpleInterest);
		return mav;
		
	}
}