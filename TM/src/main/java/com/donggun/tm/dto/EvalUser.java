package com.donggun.tm.dto;

public class EvalUser {
	private int mid;
	private String src_user;
	private String des_user;
	private int m_score; // manner score
	private String description;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getSrc_user() {
		return src_user;
	}

	public void setSrc_user(String src_user) {
		this.src_user = src_user;
	}

	public String getDes_user() {
		return des_user;
	}

	public void setDes_user(String des_user) {
		this.des_user = des_user;
	}

	public int getM_score() {
		return m_score;
	}

	public void setM_score(int m_score) {
		this.m_score = m_score;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "EvalUser [mid=" + mid + ", src_user=" + src_user + ", des_user=" + des_user + ", m_score=" + m_score
				+ ", description=" + description + "]";
	}

}
