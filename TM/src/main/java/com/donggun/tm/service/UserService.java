package com.donggun.tm.service;

import java.util.List;

import com.donggun.tm.dto.User;

public interface UserService {
	public User getUser(String id) throws Exception;
	public List<User> getAllUser() throws Exception;
	public User userLogin(String id, String password) throws Exception;
	
	public void insertUser(User user) throws Exception;
	
	public void updateUser(User user) throws Exception;
	
	public void deleteUser(String id) throws Exception;
}
