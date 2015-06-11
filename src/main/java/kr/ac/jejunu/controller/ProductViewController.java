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
@RequestMapping(value ="/productArticle")
public class ProductViewController {
	@Autowired
	private ProductService productService;
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productView(@RequestParam(value = "boardNum", required=true, defaultValue = "0") int boardNum, HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
		Product product = new Product();
		User user = (User) session.getAttribute("user");
		
		if(user != null && user.getUserType().equals("ÆÇ¸ÅÀÚ")){
			modelAndView.addObject("seller", user.getName());
		}else {
			List<String> script = new ArrayList<String>();
			script.add("userDisplay();");
			modelAndView.addObject("userDispaly", script.get(0));
		}
		
		product.setBoardNum(boardNum);
		modelAndView.addObject("productInfo", productService.boardView(product).get(0));
		modelAndView.setViewName("productArticle");
		return modelAndView;
	}
}
