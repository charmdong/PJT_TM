package com.donggun.tm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.ApplyPostDAO;
import com.donggun.tm.dao.MatchPostDAO;
import com.donggun.tm.dto.ApplyPost;
import com.donggun.tm.dto.MatchPost;

@Service
public class MatchPostServiceImpl implements MatchPostService {

	private MatchPostDAO matchPostDao;
	private ApplyPostDAO applyPostDao;
	
	@Autowired
	public void setMatchPostDao(MatchPostDAO matchPostDao) {
		this.matchPostDao = matchPostDao;
	}
	
	@Autowired
	public void setApplyPostDao(ApplyPostDAO applyPostDao) {
		this.applyPostDao = applyPostDao;
	}

	@Override
	public List<MatchPost> searchMatchPost(Map param) throws Exception {
		return matchPostDao.searchMatchPost(param);
	}
	
	@Override
	public List<MatchPost> searchMatchPostById(String id) throws Exception {
		return matchPostDao.searchMatchPostById(id);
	}

	@Override
	public List<MatchPost> searchMatchPostByApplyId(String id) throws Exception {
		return matchPostDao.searchMatchPostByApplyId(id);
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

	// 신청하기 관련
	
	@Override
	public List<ApplyPost> searchApplyPost(int post_no) throws Exception {
		return applyPostDao.searchApplyPostList(post_no);
	}

	@Override
	public int searchIsApplied(Map param) throws Exception {
		return applyPostDao.searchIsApplied(param);
	}

	@Override
	public void insertApplyPost(ApplyPost applyPost) throws Exception {
		applyPostDao.insertApplyPost(applyPost);
	}

	@Override
	public void updateApplyPost(ApplyPost applyPost) throws Exception {
		applyPostDao.updateApplyPost(applyPost);
		
	}

	@Override
	public void deleteApplyPost(Map param) throws Exception {
		applyPostDao.deleteApplyPost(param);
	}

}
