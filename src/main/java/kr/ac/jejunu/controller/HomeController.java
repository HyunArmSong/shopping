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
		// list.add(new Product("#", "ǰ�� ���� ��ǰ A 20% �����Ǹ�", "15,000", "(��)���ִ��б�"));

		modelAndView.addObject("productList", productService.list());
		modelAndView.setViewName("index");

		return modelAndView;
	}
}
