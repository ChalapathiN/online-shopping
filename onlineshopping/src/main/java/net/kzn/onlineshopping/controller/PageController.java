package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView model =new ModelAndView("page");
		model.addObject("greeting","welcome to Spring WEB MVc");
		return model;
	}
	

}
