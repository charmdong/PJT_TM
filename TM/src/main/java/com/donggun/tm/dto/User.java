package com.donggun.tm.dto;

import java.sql.Date;

public class User {
	private String id;
	private String password;
	private String name;
	private Date birth;
	private String phone;
	private String email;
	private int club_code;
	private double ntrp;
	private double avg_eval_grade;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getClub_code() {
		return club_code;
	}

	public void setClub_code(int club_code) {
		this.club_code = club_code;
	}

	public double getNtrp() {
		return ntrp;
	}

	public void setNtrp(double ntrp) {
		this.ntrp = ntrp;
	}

	public double getAvg_eval_grade() {
		return avg_eval_grade;
	}

	public void setAvg_eval_grade(double avg_eval_grade) {
		this.avg_eval_grade = avg_eval_grade;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", phone=" + phone
				+ ", email=" + email + ", club_code=" + club_code + ", ntrp=" + ntrp + ", avg_eval_grade="
				+ avg_eval_grade + "]";
	}

}
