package com.donggun.tm.service;

import java.util.List;
import java.util.Map;

import com.donggun.tm.dto.MatchPost;

public interface MatchPostService {
	public List<MatchPost> searchMatchPost(Map param) throws Exception;
	public MatchPost detailMatchPost(int post_no) throws Exception;
	
	public void insertMatchPost(MatchPost match) throws Exception;
	public void updateMatchPost(MatchPost match) throws Exception;
	public void deleteMatchPost(int post_no) throws Exception;
}
