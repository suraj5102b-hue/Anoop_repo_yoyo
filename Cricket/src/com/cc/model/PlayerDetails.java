package com.cc.model;

public class PlayerDetails {
	String name;
	String team;
	int age;
	int matches;
	int runs;
	int wickets;
	
	public PlayerDetails(String name, String team, int age, int matches, int runs, int wickets) {
		this.name = name;
		this.team = team;
		this.age = age;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
	

}
