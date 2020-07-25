package com.donggun.tm.dto;

import java.sql.Date;

public class MatchResult {
	private int mid;
	private String team_a_player1;
	private String team_a_player2;
	private String team_b_player1;
	private String team_b_player2;
	private int team_a_club_code;
	private int team_b_club_code;
	private Date match_date;
	private int match_court_code;
	private int match_type;
	private int winner;
	private int play_time_hour;
	private int play_time_min;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getTeam_a_player1() {
		return team_a_player1;
	}

	public void setTeam_a_player1(String team_a_player1) {
		this.team_a_player1 = team_a_player1;
	}

	public String getTeam_a_player2() {
		return team_a_player2;
	}

	public void setTeam_a_player2(String team_a_player2) {
		this.team_a_player2 = team_a_player2;
	}

	public String getTeam_b_player1() {
		return team_b_player1;
	}

	public void setTeam_b_player1(String team_b_player1) {
		this.team_b_player1 = team_b_player1;
	}

	public String getTeam_b_player2() {
		return team_b_player2;
	}

	public void setTeam_b_player2(String team_b_player2) {
		this.team_b_player2 = team_b_player2;
	}

	public int getTeam_a_club_code() {
		return team_a_club_code;
	}

	public void setTeam_a_club_code(int team_a_club_code) {
		this.team_a_club_code = team_a_club_code;
	}

	public int getTeam_b_club_code() {
		return team_b_club_code;
	}

	public void setTeam_b_club_code(int team_b_club_code) {
		this.team_b_club_code = team_b_club_code;
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

	public int getWinner() {
		return winner;
	}

	public void setWinner(int winner) {
		this.winner = winner;
	}

	public int getPlay_time_hour() {
		return play_time_hour;
	}

	public void setPlay_time_hour(int play_time_hour) {
		this.play_time_hour = play_time_hour;
	}

	public int getPlay_time_min() {
		return play_time_min;
	}

	public void setPlay_time_min(int play_time_min) {
		this.play_time_min = play_time_min;
	}

	@Override
	public String toString() {
		return "MatchResult [mid=" + mid + ", team_a_player1=" + team_a_player1 + ", team_a_player2=" + team_a_player2
				+ ", team_b_player1=" + team_b_player1 + ", team_b_player2=" + team_b_player2 + ", team_a_club_code="
				+ team_a_club_code + ", team_b_club_code=" + team_b_club_code + ", match_date=" + match_date
				+ ", match_court_code=" + match_court_code + ", match_type=" + match_type + ", winner=" + winner
				+ ", play_time_hour=" + play_time_hour + ", play_time_min=" + play_time_min + "]";
	}

}
