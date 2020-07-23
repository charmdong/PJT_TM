package com.donggun.tm.dto;

public class Club {
	private int club_code;
	private String name;
	private int city_code;
	private int gu_code;
	private String rep_id;
	private double avg_ntrp;

	public int getClub_code() {
		return club_code;
	}

	public void setClub_code(int club_code) {
		this.club_code = club_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCity_code() {
		return city_code;
	}

	public void setCity_code(int city_code) {
		this.city_code = city_code;
	}

	public int getGu_code() {
		return gu_code;
	}

	public void setGu_code(int gu_code) {
		this.gu_code = gu_code;
	}

	public String getRep_id() {
		return rep_id;
	}

	public void setRep_id(String rep_id) {
		this.rep_id = rep_id;
	}

	public double getAvg_ntrp() {
		return avg_ntrp;
	}

	public void setAvg_ntrp(double avg_ntrp) {
		this.avg_ntrp = avg_ntrp;
	}

	@Override
	public String toString() {
		return "Club [club_code=" + club_code + ", name=" + name + ", city_code=" + city_code + ", gu_code=" + gu_code
				+ ", rep_id=" + rep_id + ", avg_ntrp=" + avg_ntrp + "]";
	}

}
