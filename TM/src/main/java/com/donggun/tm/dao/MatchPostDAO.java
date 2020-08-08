package com.donggun.tm.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.donggun.tm.dto.MatchPost;

@Mapper
@Repository
public interface MatchPostDAO {
	// SELECT
	public List<MatchPost> searchMatchPost(Map param) throws SQLException;
	public MatchPost detailMatchPost(int post_no) throws SQLException;
	
	// INSERT
	public void insertMatchPost(MatchPost match) throws SQLException;
	
	// UPDATE
	public void updateMatchPost(MatchPost match) throws SQLException;
	
	// DELTE
	public void deleteMatchPost(int post_no) throws SQLException;
}
