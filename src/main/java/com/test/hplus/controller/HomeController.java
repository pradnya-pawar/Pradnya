package com.test.hplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String goHome()
	{
		System.out.println("We r in HomeController");
		return "index";//View Name is Index.jsp
		//Dispatcher servlet work with viewResolver and resolve that to this index.jsp template
		
	}
	

	  @GetMapping("/goToSearch") 
	  public String goToSearch() { //Requestparam-We should expect "search" in
	  //upcoming request //Model-Any information we need to display on page after
	  //returning value can be put model attribute
	  System.out.println("Inside search Controller");
	 
	  return "search";//with this
	  //you are just returning view name not attribute data to be rendered on jsp page 
	  }
	 
   
	/*
	 * @GetMapping("/search") public ModelAndView search() {
	 * System.out.println("Inside search Controller"); ModelAndView model = new
	 * ModelAndView(); model.setView("search"); return model; //with this you can
	 * return data as well as view model.addObject(attributeValue) return
	 * "search"; }
	 */
}
