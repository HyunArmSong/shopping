package kr.ac.jejunu;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {

		ModelAndView modelAndView = new ModelAndView();

		List<Product> list = new ArrayList<Product>();
		list.add(new Product("#","품질 좋은 상품 A 20% 할인판매", "15,000", "(주)제주대학교"));


		modelAndView.addObject("myList", list);
		modelAndView.setViewName("index");

		return modelAndView;
	}

}
