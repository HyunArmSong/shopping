package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("insertProduct")
public class InsertProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView insertOpen(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		User user = (User) session.getAttribute("user");

		modelAndView.addObject("userName", user.getName());
		modelAndView.addObject("getBoarderNum", productService.getBoarderNum());

		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView insert(HttpSession session, @ModelAttribute Product product) {
		ModelAndView modelAndView = new ModelAndView();
		User user = (User) session.getAttribute("user");

		modelAndView.addObject("userName", user.getName());
		productService.insertProduct(product);
		modelAndView.setViewName("redirect:/");

		return modelAndView;

	}

}
