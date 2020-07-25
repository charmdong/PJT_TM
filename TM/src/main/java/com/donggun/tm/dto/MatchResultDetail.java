package com.donggun.tm.dto;

public class MatchResultDetail {
	private int mid;
	private int set_no;
	private int game_score_team_a;
	private int game_score_team_b;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getSet_no() {
		return set_no;
	}

	public void setSet_no(int set_no) {
		this.set_no = set_no;
	}

	public int getGame_score_team_a() {
		return game_score_team_a;
	}

	public void setGame_score_team_a(int game_score_team_a) {
		this.game_score_team_a = game_score_team_a;
	}

	public int getGame_score_team_b() {
		return game_score_team_b;
	}

	public void setGame_score_team_b(int game_score_team_b) {
		this.game_score_team_b = game_score_team_b;
	}

	@Override
	public String toString() {
		return "MatchResultDetail [mid=" + mid + ", set_no=" + set_no + ", game_score_team_a=" + game_score_team_a
				+ ", game_score_team_b=" + game_score_team_b + "]";
	}

}
