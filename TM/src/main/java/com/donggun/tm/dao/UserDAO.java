package com.donggun.tm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.donggun.tm.dto.User;

@Mapper
@Repository
public interface UserDAO {
	// SELECT
	public User searchUser(String id) throws SQLException;
	public List<User> searchAllUser() throws SQLException;
	public User userLogin(@Param("id")String id, @Param("password") String password) throws SQLException;
	
	// INSERT
	public void insertUser(User user) throws SQLException;
	
	// UPDATE
	public void updateUser(User user) throws SQLException;
	
	// DELETE
	public void deleteUser(String id) throws SQLException;
}
