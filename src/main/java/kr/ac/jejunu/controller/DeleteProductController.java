package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("deleteProduct")
public class DeleteProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam(value = "boardNum", required = true, defaultValue = "0") int boardNum){
		ModelAndView modelAndView = new ModelAndView();
		
		productService.deleteProduct(boardNum);
		modelAndView.setViewName("redirect:/");
		
		return modelAndView;
	}

}
