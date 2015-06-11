package kr.ac.jejunu.controller;

import java.util.Locale;

import kr.ac.jejunu.service.UpdateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateController {
	@Autowired
	private UpdateService updateService;
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView board(Locale locale, Model model){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("product", updateService.list());
		modelAndView.setViewName("productBoard");
		
		return modelAndView;
	}
	
	
}
