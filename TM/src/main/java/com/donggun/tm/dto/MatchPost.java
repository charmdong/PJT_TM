package com.donggun.tm.dto;

import java.sql.Date;

public class MatchPost {
	private int post_no;
	private String reg_id;
	private String title;
	private String description;
	private Date match_date;
	private int match_court_code;
	private int match_type;
	private boolean matching_completed;
	private Date reg_date;
	private int matched_apply_no;

	public int getPost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getMatch_date() {
		return match_date;
	}

	public void setMatch_date(Date match_date) {
		this.match_date = match_date;
	}

	public int getMatch_court_code() {
		return match_court_code;
	}

	public void setMatch_court_code(int match_court_code) {
		this.match_court_code = match_court_code;
	}

	public int getMatch_type() {
		return match_type;
	}

	public void setMatch_type(int match_type) {
		this.match_type = match_type;
	}

	public boolean isMatching_completed() {
		return matching_completed;
	}

	public void setMatching_completed(boolean matching_completed) {
		this.matching_completed = matching_completed;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	public int getMatched_apply_no() {
		return matched_apply_no;
	}

	public void setMatched_apply_no(int matched_apply_no) {
		this.matched_apply_no = matched_apply_no;
	}

	@Override
	public String toString() {
		return "MatchPost [post_no=" + post_no + ", reg_id=" + reg_id + ", title=" + title + ", description="
				+ description + ", match_date=" + match_date + ", match_court_code=" + match_court_code
				+ ", match_type=" + match_type + ", matching_completed=" + matching_completed + ", reg_date=" + reg_date
				+ ", matched_apply_no=" + matched_apply_no + "]";
	}

}
