package com.donggun.tm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.donggun.tm.dao.ApplyPostDAO;
import com.donggun.tm.dao.MatchPostDAO;
import com.donggun.tm.dto.ApplyPost;
import com.donggun.tm.dto.MatchPost;

/**
 * @author donggun
 * @since Apr 7, 2021
 * 매치 게시글 서비스 구현 객체 
 */
@Service
public class MatchPostServiceImpl implements MatchPostService {

	private final MatchPostDAO matchPostDao;
	private final ApplyPostDAO applyPostDao;
	
	@Autowired
	public MatchPostServiceImpl(MatchPostDAO matchPostDao, ApplyPostDAO applyPostDao) {
		this.matchPostDao = matchPostDao;
		this.applyPostDao = applyPostDao;
	}

	/**
	 * 매치 게시글 조회 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MatchPost> searchMatchPost(Map param) throws Exception {
		return matchPostDao.searchMatchPost(param);
	}
	
	/**
	 * 작성자 아이디에 해당하는 게시글 조회 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MatchPost> searchMatchPostById(String id) throws Exception {
		return matchPostDao.searchMatchPostById(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MatchPost> searchMatchPostByApplyId(String id) throws Exception {
		return matchPostDao.searchMatchPostByApplyId(id);
	}

	/**
	 * 매치 게시글 상세 보기 
	 * @param post_no
	 * @return
	 * @throws Exception
	 */
	@Override
	public MatchPost detailMatchPost(int post_no) throws Exception {
		return matchPostDao.detailMatchPost(post_no);
	}

	/**
	 * 매치 게시글 등록 
	 * @param match
	 * @throws Exception
	 */
	@Override
	public void insertMatchPost(MatchPost match) throws Exception {
		matchPostDao.insertMatchPost(match);
	}

	/**
	 * 매치 게시글 수정 
	 * @param match
	 * @throws Exception
	 */
	@Override
	public void updateMatchPost(MatchPost match) throws Exception {
		matchPostDao.updateMatchPost(match);
	}

	/**
	 * 매치 게시글 상태 변경 
	 * @param param
	 * @throws Exception
	 */
	@Override
	public void updateMatchPostStatus(Map param) throws Exception {
		matchPostDao.updateMatchPostStatus(param);
	}

	/**
	 * 매치 게시글 삭제 
	 * @param post_no
	 * @throws Exception
	 */
	@Override
	public void deleteMatchPost(int post_no) throws Exception {
		matchPostDao.deleteMatchPost(post_no);
	}

	// 신청하기 관련
	
	/**
	 * 게시글 번호로 게시글 조회 
	 * @param post_no
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<ApplyPost> searchApplyPost(int post_no) throws Exception {
		return applyPostDao.searchApplyPostList(post_no);
	}

	/**
	 * 매치 게시글 신청 여부 조회 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	@Override
	public int searchIsApplied(Map param) throws Exception {
		return applyPostDao.searchIsApplied(param);
	}

	/**
	 * 매치 신청 게시글 등록 
	 * @param applyPost
	 * @throws Exception
	 */
	@Override
	public void insertApplyPost(ApplyPost applyPost) throws Exception {
		applyPostDao.insertApplyPost(applyPost);
	}

	/**
	 * 매치 신청 게시글 수정 
	 * @param applyPost
	 * @throws Exception
	 */
	@Override
	public void updateApplyPost(ApplyPost applyPost) throws Exception {
		applyPostDao.updateApplyPost(applyPost);
	}

	/**
	 * 매치 신청 게시글 삭제 
	 * @param param
	 * @throws Exception
	 */
	@Override
	public void deleteApplyPost(Map param) throws Exception {
		applyPostDao.deleteApplyPost(param);
	}

}
