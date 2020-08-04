package com.donggun.tm.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.donggun.tm.dto.Club;

@Mapper
@Repository
public interface ClubDAO {
	// SELECT
	public List<Club> searchClub(String name) throws SQLException;
	public List<Club> searchAllClub() throws SQLException;
	
	// INSERT
	public void insertClub(Club club) throws SQLException;
	
	// UPDATE
	public void updateClub(Club club) throws SQLException;
	
	// DELETE
	public void deleteClub(int club_code) throws SQLException;
}
