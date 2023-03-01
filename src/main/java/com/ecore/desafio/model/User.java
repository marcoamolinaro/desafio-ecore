package com.ecore.desafio.model;

public class User {
	
	private String id;
	private String displayName;
	
	public User() {}

	public User(String id, String displayName) {
		this.id = id;
		this.displayName = displayName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", displayName=" + displayName + "]";
	}
}
