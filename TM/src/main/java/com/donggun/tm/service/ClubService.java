package com.donggun.tm.service;

import java.util.List;

import com.donggun.tm.dto.Club;

public interface ClubService {
	public List<Club> getClub(String name) throws Exception;
	public List<Club> getAllClub() throws Exception;

	public void insertClub(Club club) throws Exception;
	
	public void updateClub(Club club) throws Exception;
	
	public void deleteClub(int club_code) throws Exception;
}
