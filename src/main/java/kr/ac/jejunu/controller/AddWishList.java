package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.model.WishList;
import kr.ac.jejunu.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("addWishList")
public class AddWishList {
	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView addWishList(@RequestParam(value = "boardNum", required = true, defaultValue = "0") int boardNum, HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();

		User user = (User) session.getAttribute("user");
		WishList wishList = new WishList();
		wishList.setBoardNum(boardNum);
		wishList.setUserId(user.getUserId());
		if (productService.findDuplicateWishList(wishList) > 0) {
			modelAndView.setViewName("redirect:/productArticle?boardNum="+boardNum+"&alert=1");
		} else {
			productService.insertWishList(wishList);
			modelAndView.setViewName("redirect:/wishList");
		}
		return modelAndView;
	}

}
