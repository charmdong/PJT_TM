package com.donggun.tm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.donggun.tm.dto.Club;
import com.donggun.tm.service.ClubService;



@RequestMapping("/club")
@Controller
public class ClubController {

	private ClubService clubService;
	
	@Autowired
	public void setClubService(ClubService clubService) {
		this.clubService = clubService;
	}
	
	@PostMapping("/insert.do")
	public String insertClub(Club club, Model model) {
		System.out.println("#parameter : " + club);
		
		try {
			clubService.insertClub(club);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			model.addAttribute("errorMessage", "ClubService.insertClub() 수행 중 Exception 발생");
			return "errorPage";
		}
		
		return "redirect:/";
	}
	
	// TODO updateClub, deleteClub
}
