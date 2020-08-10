package com.donggun.tm.dto;

import java.sql.Date;

public class ApplyPost {

	private int no;
	private int post_no;
	private String apply_id;
	private Date apply_date;
	private String description;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPost_no() {
		return post_no;
	}

	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}

	public String getApply_id() {
		return apply_id;
	}

	public void setApply_id(String apply_id) {
		this.apply_id = apply_id;
	}

	public Date getApply_date() {
		return apply_date;
	}

	public void setApply_date(Date apply_date) {
		this.apply_date = apply_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ApplyPost [no=" + no + ", post_no=" + post_no + ", apply_id=" + apply_id + ", apply_date=" + apply_date
				+ ", description=" + description + "]";
	}

}
