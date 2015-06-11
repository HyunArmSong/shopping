package kr.ac.jejunu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitLogin(@ModelAttribute User user, HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		List<String> startScript = new ArrayList<String>();

		User loginUser = userService.login(user);

		if (loginUser != null) {
			httpSession.setAttribute("user", loginUser);
			modelAndView.setViewName("redirect:/");
		} else {
			startScript.add("startAlert();");
			modelAndView.addObject("notFindUser", startScript.get(0));
		}

		return modelAndView;
	}
}
