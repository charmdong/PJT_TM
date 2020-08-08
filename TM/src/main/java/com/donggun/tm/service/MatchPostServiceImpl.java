package com.donggun.tm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.MatchPostDAO;
import com.donggun.tm.dto.MatchPost;

@Service
public class MatchPostServiceImpl implements MatchPostService {

	private MatchPostDAO matchPostDao;
	
	@Autowired
	public void setMatchPostDao(MatchPostDAO matchPostDao) {
		this.matchPostDao = matchPostDao;
	}

	@Override
	public List<MatchPost> searchMatchPost(Map param) throws Exception {
		return matchPostDao.searchMatchPost(param);
	}
	
	@Override
	public MatchPost detailMatchPost(int post_no) throws Exception {
		return matchPostDao.detailMatchPost(post_no);
	}

	@Override
	public void insertMatchPost(MatchPost match) throws Exception {
		matchPostDao.insertMatchPost(match);
	}

	@Override
	public void updateMatchPost(MatchPost match) throws Exception {
		matchPostDao.updateMatchPost(match);
	}

	@Override
	public void deleteMatchPost(int post_no) throws Exception {
		matchPostDao.deleteMatchPost(post_no);
	}

}
