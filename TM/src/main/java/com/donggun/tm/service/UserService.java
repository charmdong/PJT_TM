package com.donggun.tm.service;

import java.util.List;

import com.donggun.tm.dto.User;

public interface UserService {
	
	/**
	 * 사용자 정보 조회 
	 * @param id
	 * @return
	 */
	public User getUser(String id);
	
	/**
	 * 모든 사용자 정보 조회 
	 * @return
	 */
	public List<User> getAllUser();
	
	/**
	 * 로그인 
	 * @param id
	 * @param password
	 * @return
	 */
	public User userLogin(String id, String password);
	
	/**
	 * 사용자 정보 등록 
	 * @param user
	 */
	public void insertUser(User user);
	
	/**
	 * 사용자 정보 수정 
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 사용자 정보 삭제 
	 * @param id
	 */
	public void deleteUser(String id);
}
