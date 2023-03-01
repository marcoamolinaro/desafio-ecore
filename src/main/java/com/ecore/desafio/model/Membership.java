package com.ecore.desafio.model;

public class Membership {
	private Role role;
	private User user;
	private Team team;

	public Membership() {}

	public Membership(Role role, User user, Team team) {
		this.role = role;
		this.user = user;
		this.team = team;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
