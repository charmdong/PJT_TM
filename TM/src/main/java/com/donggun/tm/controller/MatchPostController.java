package com.donggun.tm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@PostMapping("/insert.do")
	public String insertMatchPost(MatchPost match, Model model) {
		System.out.println("#parameter : " + match);
		
		try {
			matchPostService.insertMatchPost(match);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "MatchPostService.insertMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return ""; // TODO
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
		
		return ""; // TODO
	}
	
	@PostMapping("/delete.do")
	public String deleteMatchPost(int post_no, Model model) {
		System.out.println("@#parameter : " + post_no);
		
		try {
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorPage", "MatchPostService.deleteMatchPost() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return ""; // TODO
	}
}
