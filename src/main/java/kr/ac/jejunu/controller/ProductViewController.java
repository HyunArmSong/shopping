package kr.ac.jejunu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.ProductService;
import kr.ac.jejunu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/productArticle")
public class ProductViewController {
	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productView(@RequestParam(value = "boardNum", required = true, defaultValue = "0") int boardNum,
			@RequestParam(value = "alert", required = true, defaultValue = "0") int alert, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		Product product = new Product();
		User user = (User) session.getAttribute("user");

		System.out.println("looooooooooooooooooooooooooooooooog : " + user);

		if (user != null && user.getUserType().equals("판매자")) {
			modelAndView.addObject("seller", user.getName());
			System.out.println("looooooooooooooooooooooooooooooooog : 11111111");
		} else if (user != null) {
			List<String> script = new ArrayList<String>();
			script.add("userDisplay();");
			modelAndView.addObject("userDisplay", script.get(0));
			System.out.println("looooooooooooooooooooooooooooooooog : 2222222222");
		} else {
			List<String> script = new ArrayList<String>();
			script.add("notUserDisplay();");
			modelAndView.addObject("userDisplay", script.get(0));
		}

		if (alert == 1) {
			List<String> alertPlay = new ArrayList<String>();
			alertPlay.add("alert('이미 같은상품이 장바구니에 있습니다.');");
			modelAndView.addObject("alert", alertPlay.get(0));
		}

		product.setBoardNum(boardNum);
		modelAndView.addObject("productInfo", productService.boardView(product).get(0));
		modelAndView.setViewName("productArticle");
		return modelAndView;
	}
}
