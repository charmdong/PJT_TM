package com.donggun.tm.controller;

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
		
		return "boardList";
	}
	
	@GetMapping("/detail.do")
	public String detailMatchPost(int post_no, Model model) {
		System.out.println("#parameter : " + post_no);
		MatchPost matchInfo = null;
		
		try {
			matchInfo = matchPostService.detailMatchPost(post_no);
			model.addAttribute("matchInfo", matchInfo);
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
	
	@GetMapping("/searchApply.do")
	public String getApplyPost(int post_no, Model model) {
		System.out.println("#parameter : " + post_no);
		
		try {
			matchPostService.searchApplyPost(post_no);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.searchApplyPostList() 실행 중 Exception 발생");
			return "errorPage";
		}
		
		return ""; // TODO
	}
	
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
		
		return "boardList";
	}
}
