package com.donggun.tm.dto;

public class UserMatchRecord {
	private String id;
	private int win_single;
	private int lose_single;
	private int win_double;
	private int lose_double;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getWin_single() {
		return win_single;
	}

	public void setWin_single(int win_single) {
		this.win_single = win_single;
	}

	public int getLose_single() {
		return lose_single;
	}

	public void setLose_single(int lose_single) {
		this.lose_single = lose_single;
	}

	public int getWin_double() {
		return win_double;
	}

	public void setWin_double(int win_double) {
		this.win_double = win_double;
	}

	public int getLose_double() {
		return lose_double;
	}

	public void setLose_double(int lose_double) {
		this.lose_double = lose_double;
	}

	@Override
	public String toString() {
		return "UserMatchRecord [id=" + id + ", win_single=" + win_single + ", lose_single=" + lose_single
				+ ", win_double=" + win_double + ", lose_double=" + lose_double + "]";
	}

}
