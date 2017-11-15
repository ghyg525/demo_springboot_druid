package org.yangjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.yangjie.entity.User;
import org.yangjie.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;  
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String username, String password, Model model) {
		User user = userService.get(username, password);
		if (user!=null && user.getUserid()>0) {
			return "/index.jsp";
		}
		model.addAttribute("msg", "用户名或密码错误!");
		return "/login.jsp";
	}	
	
	
}
