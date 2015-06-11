package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("wishList")
public class WishListController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView wishList(HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
		User user = (User) session.getAttribute("user");
		
		modelAndView.addObject("wishList", productService.wishList(user.getUserId()));
		return modelAndView;
	}
}
