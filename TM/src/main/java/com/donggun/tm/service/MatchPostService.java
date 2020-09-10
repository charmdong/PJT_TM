package com.donggun.tm.service;

import java.util.List;
import java.util.Map;

import com.donggun.tm.dto.ApplyPost;
import com.donggun.tm.dto.MatchPost;

public interface MatchPostService {
	public List<MatchPost> searchMatchPost(Map param) throws Exception;
	public List<MatchPost> searchMatchPostById(String id) throws Exception;
	public List<MatchPost> searchMatchPostByApplyId(String id) throws Exception;
	public MatchPost detailMatchPost(int post_no) throws Exception;
	
	public void insertMatchPost(MatchPost match) throws Exception;
	public void updateMatchPost(MatchPost match) throws Exception;
	public void updateMatchPostStatus(Map param) throws Exception;
	public void deleteMatchPost(int post_no) throws Exception;
	
	// 신청하기 관련
	public List<ApplyPost> searchApplyPost(int post_no) throws Exception;
	public int searchIsApplied(Map param) throws Exception;
	
	public void insertApplyPost(ApplyPost applyPost) throws Exception;
	public void updateApplyPost(ApplyPost applyPost) throws Exception;
	public void deleteApplyPost(Map param) throws Exception;
}
