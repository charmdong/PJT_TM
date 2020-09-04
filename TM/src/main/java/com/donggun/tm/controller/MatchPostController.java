package com.donggun.tm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donggun.tm.dto.ApplyPost;
import com.donggun.tm.dto.MatchPost;
import com.donggun.tm.service.MatchPostService;

@RequestMapping("/matchPost")
@Controller
public class MatchPostController {

	private MatchPostService matchPostService;
	
	@Autowired
	public void setMatchPostService(MatchPostService matchPostService) {
		this.matchPostService = matchPostService;
	}
	
	/**
	 * 모든 게시글 조회
	 * @param param
	 * @param model
	 * @return
	 */
	@GetMapping("/search.do")
	public String getMatchPost(Map param, Model model) {
		System.out.println("#parameter : " + param);
		List<MatchPost> matchPostList = null;
		
		model.addAttribute("pageTitle", "매칭 게시판");
		try {
			matchPostList = matchPostService.searchMatchPost(param);
			model.addAttribute("matchPostList", matchPostList);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.getMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "boardList";
	}
	
	
	/**
	 * 내가 쓴 게시글 보기
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/searchMyPost.do")
	public String searchMatchPostById(String id, Model model) {
		System.out.println("#parameter : " + id);
		List<MatchPost> matchPostList = null;
		
		model.addAttribute("pageTitle", "내가 쓴 게시글");
		try {
			matchPostList = matchPostService.searchMatchPostById(id);
			model.addAttribute("matchPostList", matchPostList);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.searchMatchPostById() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "boardList";
	}
	
	/**
	 * 내가 신청한 게시글 보기
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/searchMyApplyPost.do")
	public String searchMatchPostByApplyId(String id, Model model) {
		System.out.println("#parameter : " + id);
		List<MatchPost> matchPostList = null;
		
		model.addAttribute("pageTitle", "내가 신청한 게시글");
		try {
			matchPostList = matchPostService.searchMatchPostByApplyId(id);
			model.addAttribute("matchPostList", matchPostList);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.searchMatchPostById() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "applyBoardList";
	}
	
	/**
	 * 게시글 상세 보기
	 * @param post_no
	 * @param model
	 * @return
	 */
	@GetMapping("/detail.do")
	public String detailMatchPost(int post_no, HttpSession session, Model model) {
		System.out.println("#parameter : " + post_no);
		
		Map<String, Object> param = new HashMap<>();
		param.put("post_no", post_no);
		param.put("apply_id", session.getAttribute("id"));
		
		MatchPost matchInfo = null;
		int isApplied = 0;
		
		try {
			matchInfo = matchPostService.detailMatchPost(post_no);
			model.addAttribute("matchInfo", matchInfo);
			
			isApplied = matchPostService.searchIsApplied(param);
			model.addAttribute("isApplied", isApplied);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostServie.detailMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "detail";
	}
	
	@GetMapping("registerForm.do")
	public String registerForm() {
		return "registerForm";
	}
	
	/**
	 * 게시글 작성하기
	 * @param match
	 * @param session
	 * @param model
	 * @return
	 */
	@PostMapping("/insert.do")
	public String insertMatchPost(MatchPost match, HttpSession session, Model model) {
		System.out.println("#parameter : " + match);
		match.setReg_id((String)session.getAttribute("id"));
		
		try {
			matchPostService.insertMatchPost(match);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.insertMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/matchPost/search.do"; 
	}
	
	/**
	 * 게시글 수정하기
	 * @param match
	 * @param model
	 * @return
	 */
	@PostMapping("/update.do")
	public String updateMatchPost(MatchPost match, Model model) {
		System.out.println("#parameter : " + match);
		
		try {
			matchPostService.updateMatchPost(match);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.updateMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/matchPost/detail.do?post_no=" + match.getPost_no();
	}
	
	/**
	 * 게시글 삭제하기
	 * @param post_no
	 * @param model
	 * @return
	 */
	@GetMapping("/delete.do")
	public String deleteMatchPost(int post_no, Model model) {
		System.out.println("#parameter : " + post_no);
		
		try {
			matchPostService.deleteMatchPost(post_no);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.deleteMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/matchPost/search.do";
	}
	
	// 신청하기 관련
	
	/**
	 * 게시글 신청 현황 조회
	 * @param post_no
	 * @param model
	 * @return
	 */
	@GetMapping("/searchApply.do") // TODO 필요성 검토
	public String getApplyPost(int post_no, Model model) {
		System.out.println("#parameter : " + post_no);
		List<ApplyPost> applyPostList = null;
		
		try {
			applyPostList = matchPostService.searchApplyPost(post_no);
			model.addAttribute("applyPostList", applyPostList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.searchApplyPostList() 실행 중 Exception 발생");
			return "errorPage";
		}
		
		return "applyBoardList";
	}
	
	/**
	 * 경기 매칭 신청하기
	 * @param applyPost
	 * @param model
	 * @return
	 */
	@PostMapping("/insertApply.do")
	public String inserApplyPost(ApplyPost applyPost, Model model) {
		System.out.println("#parameter : " + applyPost);
		
		try {
			matchPostService.insertApplyPost(applyPost);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.insertApplyPost() 실행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/matchPost/search.do";
	}
	
	/**
	 * 경기 매칭 신청 취소하기
	 * @param param
	 * post_no - 게시글 번호
	 * apply_id - 신청 아이디
	 * @param model
	 * @return
	 */
	@GetMapping("/deleteApply.do")
	public String deleteApplyPost(int post_no, String apply_id, Model model) {
		System.out.println("#parameter : " + post_no + "," + apply_id);
		
		Map<String, Object> param = new HashMap<>();
		param.put("post_no", post_no);
		param.put("apply_id", apply_id);
		
		try {
			matchPostService.deleteApplyPost(param);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.deleteApplyPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		// TODO 상세 보기 중에서 삭제했을 경우에는 그대로 그 게시글로 돌아가야 한다. -> 비동기
		return "redirect:/matchPost/searchMyApplyPost.do?id=" + apply_id;
	}
}
