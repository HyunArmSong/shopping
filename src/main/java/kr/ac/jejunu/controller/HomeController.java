package kr.ac.jejunu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.User;
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
@RequestMapping(value = "/")
public class HomeController {
	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model, HttpSession session) {

		ModelAndView modelAndView = new ModelAndView();
		User user = (User) session.getAttribute("user");

		// List<Product> list = new ArrayList<Product>();
		// list.add(new Product("#", "품질 좋은 상품 A 20% 할인판매", "15,000", "(주)제주대학교"));
		List<User> loginUser = new ArrayList<User>();
		List<String> startScript = new ArrayList<String>();

		if (user != null) {
			loginUser.add(user);
			modelAndView.addObject("loginUser", loginUser.get(0));

			startScript.add("loginDisplay();");
			modelAndView.addObject("loginDisplay", startScript.get(0));
		}else{
			startScript.add("logoutDisplay();");
			modelAndView.addObject("logoutDisplay", startScript.get(0));
		}

		modelAndView.addObject("productList", productService.list());
		modelAndView.setViewName("index");

		return modelAndView;
	}
}
