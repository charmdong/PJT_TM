package com.donggun.tm.dto;

public class Court {
	private int court_code;
	private String name;
	private int si_code;
	private int gu_code;
	private int dong_code;
	private String url;

	public int getCourt_code() {
		return court_code;
	}

	public void setCourt_code(int court_code) {
		this.court_code = court_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSi_code() {
		return si_code;
	}

	public void setSi_code(int si_code) {
		this.si_code = si_code;
	}

	public int getGu_code() {
		return gu_code;
	}

	public void setGu_code(int gu_code) {
		this.gu_code = gu_code;
	}

	public int getDong_code() {
		return dong_code;
	}

	public void setDong_code(int dong_code) {
		this.dong_code = dong_code;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Court [court_code=" + court_code + ", name=" + name + ", si_code=" + si_code + ", gu_code=" + gu_code
				+ ", dong_code=" + dong_code + ", url=" + url + "]";
	}

}
