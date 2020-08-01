package com.donggun.tm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/loginForm.do")
	public String loginMain() {
		return "login";
	}
	
	@PostMapping("/login.do")
	public String login(String id, String password, Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		User user = null;
		
		try {
			user = userService.userLogin(id, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "UserService.userLogin() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		// Failed to login
		if(user == null) {
			model.addAttribute("errorMessage", "아이디 또는 패스워드가 일치하지 않습니다.");
			return "errorPage";
		}
		
		// Success to login
		session.setAttribute("id", id);
		session.setAttribute("password", password);
		
		return "redirect:/";
	}
	
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	/**
	 * 회원 가입
	 */
	@GetMapping("/joinForm.do")
	public String joinForm() {
		return "joinForm";
	}
	
	@PostMapping("/join.do")
	public String join(User user, Model model) {
		System.out.println(user);
		
		try {
			userService.insertUser(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "UserService.insertUser() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/";
	}
	
	/**
	 * 회원 정보 조회
	 */
	@GetMapping("/info.do")
	public String getUserInfo(String id, Model model) {
		System.out.println("#parameter : " + id);
		User user = null;
		
		try {
			user = userService.getUser(id);
			model.addAttribute("user", user);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "UserService.getUser() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "info";
	}
	
	/**
	 * 회원 정보 수정
	 */
	@GetMapping("/updateForm.do")
	public String updateForm() {
		return "updateForm";
	}
	
	@PostMapping("/update.do")
	public String update(User user, Model model) {
		System.out.println(user);
		
		try {
			userService.updateUser(user);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "UserService.updateUser() 수행 중 Exception 발생");
			return "errorPage";
		}

		return "redirect:/";
	}
	
	/**
	 * 회원 탈퇴
	 */
	@GetMapping("/delete.do")
	public String delete(String id, Model model) {
		System.out.println("#parameter: " + id);
		
		try {
			userService.deleteUser(id);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "UserService.deleteUser() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/";
	}
}
