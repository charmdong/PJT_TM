package com.donggun.tm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.UserDAO;
import com.donggun.tm.dto.User;
import com.donggun.tm.exception.TMException;

@Service
public class UserServiceImpl implements UserService {

	private final UserDAO userDao;
	
	@Autowired
	public UserServiceImpl(UserDAO userDao) {
		this.userDao = userDao;
	}

	/**
	 * 사용자 정보 조회 
	 * @param id
	 * @return
	 */
	@Override
	public User getUser(String id) {
		User user = null;

		try {
			user = userDao.searchUser(id);
		} catch (Exception e) {
			throw new TMException("getUser() Exception" + e);
		}

		return user;
	}

	/**
	 * 모든 사용자 정보 조회 
	 * @return
	 */
	@Override
	public List<User> getAllUser() {
		List<User> userList = null;

		try {
			userList = userDao.searchAllUser();
		} catch (Exception e) {
			throw new TMException("getAllUser() Exception" + e);
		}

		return userList;
	}

	/**
	 * 로그인 
	 * @param id
	 * @param password
	 * @return
	 */
	@Override
	public User userLogin(String id, String password) {
		User user = null;

		try {
			user = userDao.userLogin(id, password);
		} catch (Exception e) {
			throw new TMException("userLogin() Exception" + e);
		}

		return user;
	}

	/**
	 * 사용자 정보 등록 
	 * @param user
	 */
	@Override
	public void insertUser(User user) {
		try {
			userDao.insertUser(user);
		} catch(Exception e) {
			throw new TMException("insertUser() Exception" + e);
		}
	}

	/**
	 * 사용자 정보 수정 
	 * @param user
	 */
	@Override
	public void updateUser(User user) {
		try {
			userDao.updateUser(user);
		} catch(Exception e) {
			throw new TMException("updateUser() Exception" + e);
		}
	}

	/**
	 * 사용자 정보 삭제 
	 * @param id
	 */
	@Override
	public void deleteUser(String id) {
		try { 
			userDao.deleteUser(id);
		} catch(Exception e) {
			throw new TMException("deleteUser() Exception" + e);
		}
	}

}
