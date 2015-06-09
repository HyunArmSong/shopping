package kr.ac.jejunu.controller;

import java.util.Locale;

import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {

		ModelAndView modelAndView = new ModelAndView();

		// List<Product> list = new ArrayList<Product>();
		// list.add(new Product("#", "품질 좋은 상품 A 20% 할인판매", "15,000", "(주)제주대학교"));

		modelAndView.addObject("productList", productService.list());
		modelAndView.setViewName("index");

		return modelAndView;
	}
}
