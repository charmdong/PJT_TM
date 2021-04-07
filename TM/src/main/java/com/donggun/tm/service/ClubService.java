package com.donggun.tm.service;

import java.util.List;

import com.donggun.tm.dto.Club;

public interface ClubService {
	
	/**
	 * 클럽 정보 목록 조회 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<Club> getClub(String name) throws Exception;
	
	/**
	 * 모든 클럽 정보 목록 조회 
	 * @return
	 * @throws Exception
	 */
	public List<Club> getAllClub() throws Exception;

	/**
	 * 클럽 정보 등록 
	 * @param club
	 * @throws Exception
	 */
	public void insertClub(Club club) throws Exception;
	
	/**
	 * 클럽 정보 수정 
	 * @param club
	 * @throws Exception
	 */
	public void updateClub(Club club) throws Exception;
	
	/**
	 * 클럽 정보 삭제 
	 * @param club_code
	 * @throws Exception
	 */
	public void deleteClub(int club_code) throws Exception;
}
