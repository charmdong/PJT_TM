package com.donggun.tm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.ClubDAO;
import com.donggun.tm.dto.Club;

/**
 * 클럽 서비스 구현 객체 
 * @author donggun
 * @since Apr 7, 2021
 */
@Service
public class ClubServiceImpl implements ClubService {

	private final ClubDAO clubDao;
	
	@Autowired
	public ClubServiceImpl(ClubDAO clubDao) {
		this.clubDao = clubDao;
	}

	/**
	 * 클럽 정보 목록 조회 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Club> getClub(String name) throws Exception {
		return clubDao.searchClub(name);
	}

	/**
	 * 모든 클럽 정보 목록 조회 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Club> getAllClub() throws Exception {
		return clubDao.searchAllClub();
	}

	/**
	 * 클럽 정보 등록 
	 * @param club
	 * @throws Exception
	 */
	@Override
	public void insertClub(Club club) throws Exception {
		clubDao.insertClub(club);
	}

	/**
	 * 클럽 정보 수정 
	 * @param club
	 * @throws Exception
	 */
	@Override
	public void updateClub(Club club) throws Exception {
		clubDao.updateClub(club);
	}

	/**
	 * 클럽 정보 삭제 
	 * @param club_code
	 * @throws Exception
	 */
	@Override
	public void deleteClub(int club_code) throws Exception {
		clubDao.deleteClub(club_code);
	}

}
