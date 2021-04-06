package com.donggun.tm.api;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donggun.tm.dto.User;
import com.donggun.tm.service.UserService;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/user")
public class UserRestController {

	private final UserService userService;
	
	@Autowired
	public UserRestController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 사용자 정보 조회 
	 * @param id
	 * @return
	 */
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
	
	/**
	 * 사용자 정보 삭제 
	 * @param id
	 * @param session
	 * @return
	 */
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
