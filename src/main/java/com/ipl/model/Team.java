package com.ipl.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String teamName;
	private long totalMatch;
	private long totalWins;

	@Transient
	private List<Match> matches;

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

	public Team() {
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", totalMatch=" + totalMatch + ", totalWins=" + totalWins
				+ ", matches=" + matches + "]";
	}

	public List<Match> getMatches() {
		return matches;
	}

	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}

}
