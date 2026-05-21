package com.cc.model;

public class TestMatch {
	
	
	String player;
	int runs;
	String team;
	String country;
	int wickets;
	int matches;
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public TestMatch(String player, int runs, String team, String country, int wickets, int matches) {
		super();
		this.player = player;
		this.runs = runs;
		this.team = team;
		this.country = country;
		this.wickets = wickets;
		this.matches = matches;
	}

}
