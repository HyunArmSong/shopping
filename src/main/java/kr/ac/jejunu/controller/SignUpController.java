package kr.ac.jejunu.controller;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignUpController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView signUp() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("signUp");
		return modelAndView;
	}

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public ModelAndView submitSignUp(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		if (userService.signUpFindId(user) > 0) {

		} else {
			userService.insertUser(user);
			modelAndView.setViewName("redirect:login");
		}
		return modelAndView;
	}
}
