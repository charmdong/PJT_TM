package com.donggun.tm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.ClubDAO;
import com.donggun.tm.dto.Club;

@Service
public class ClubServiceImpl implements ClubService {

	private ClubDAO clubDao;
	
	@Autowired
	public void setDao(ClubDAO clubDao) {
		this.clubDao = clubDao;
	}
	
	@Override
	public List<Club> getClub(String name) throws Exception {
		return clubDao.searchClub(name);
	}

	@Override
	public List<Club> getAllClub() throws Exception {
		return clubDao.searchAllClub();
	}

	@Override
	public void insertClub(Club club) throws Exception {
		clubDao.insertClub(club);
	}

	@Override
	public void updateClub(Club club) throws Exception {
		clubDao.updateClub(club);
	}

	@Override
	public void deleteClub(int club_code) throws Exception {
		clubDao.deleteClub(club_code);
	}

}
