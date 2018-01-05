package net.kzn.onlineshopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping({"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting","Hi");
		
		return mv;
		
	}
	
	@RequestMapping("/test/{greeting}")
	public ModelAndView index(@PathVariable("greeting")String greeting) {
		
		System.out.println(greeting);
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("greeting",greeting);
		
		return mv;
		
	}

}

