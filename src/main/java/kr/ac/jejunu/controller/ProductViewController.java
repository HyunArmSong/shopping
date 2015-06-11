package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.Product;
import kr.ac.jejunu.service.ProductService;

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
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView productView(@RequestParam(value = "boardNum", required=true, defaultValue = "0") int boardNum, HttpSession session){
		ModelAndView modelAndView = new ModelAndView();
				
		Product product = new Product();
		product.setBoardNum(boardNum);
		modelAndView.addObject("productInfo", productService.boardView(product ).get(0));
		modelAndView.setViewName("productArticle");
		return modelAndView;
	}
}
