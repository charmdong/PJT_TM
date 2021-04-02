package com.donggun.tm.service;

import java.util.List;

import com.donggun.tm.dto.User;

public interface UserService {
	public User getUser(String id);
	public List<User> getAllUser();
	public User userLogin(String id, String password);
	
	public void insertUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(String id);
}
