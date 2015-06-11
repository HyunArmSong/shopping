package kr.ac.jejunu.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.jejunu.service.ProductService;

@Controller
public class LoghinHomController {
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/loginIndex", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("productList", productService.list());
		modelAndView.setViewName("index_login");

		return modelAndView;
	}

}
