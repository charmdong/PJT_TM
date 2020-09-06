package com.donggun.tm.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donggun.tm.dto.User;
import com.donggun.tm.service.UserService;

@RestController
@RequestMapping("/user")
public class UserRestController {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping(value = "/info/{id}")
	public User getUserInfo(@PathVariable String id) {
		User user = null;
		
		try {
			user = userService.getUser(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return user;
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteUser(@PathVariable String id, HttpSession session) {
		int deleteCnt = 0;
		
		try {
			userService.deleteUser(id);
			deleteCnt++;
			session.invalidate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return deleteCnt;
	}

}