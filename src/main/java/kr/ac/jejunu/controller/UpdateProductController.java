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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("updateProduct")
public class UpdateProductController {
	@Autowired
	private ProductService productService;
	private User user = null;
	private Product product = new Product();
	private int boardNum;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView updateView(@RequestParam(value = "boardNum", required = true, defaultValue = "0") int boardNum, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		user = (User) session.getAttribute("user");
		this.boardNum = boardNum;
		modelAndView.addObject("seller", user.getName());
		product.setBoardNum(this.boardNum);
		modelAndView.addObject("productInfo", productService.boardView(product).get(0));
		modelAndView.setViewName("updateProduct");

		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute Product product) {
		ModelAndView modelAndView = new ModelAndView();
		productService.updateProduct(product);
		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}
}
