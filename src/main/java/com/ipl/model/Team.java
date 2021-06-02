package com.ipl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	private int id;
	private String teamName;
	private long totalMatch;
	private long totalWins;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public long getTotalMatch() {
		return totalMatch;
	}

	public void setTotalMatch(long totalMatch) {
		this.totalMatch = totalMatch;
	}

	public long getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(long totalWins) {
		this.totalWins = totalWins;
	}

	public Team(String teamName, long totalMatch) {
		this.teamName = teamName;
		this.totalMatch = totalMatch;
	}

}
