package com.donggun.tm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donggun.tm.dto.User;
import com.donggun.tm.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@PostMapping("/login.do")
	public String login(String id, String password, Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		User user = null;
		
		try {
			user = userService.userLogin(id, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return "";
		}
		
		// Failed to login
		if(user == null) {
			model.addAttribute("errorMessage", "아이디 또는 패스워드가 일치하지 않습니다.");
			return "errorPage";
		}
		
		// Success to login
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		
		return "index";
	}
}
