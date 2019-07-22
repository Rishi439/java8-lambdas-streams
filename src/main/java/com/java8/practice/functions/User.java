package com.java8.practice.functions;

public class User {

	private String name;

	private int id;

	private int rank;

	private boolean isTopper;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean isTopper() {
		return isTopper;
	}

	public void setTopper(boolean isTopper) {
		this.isTopper = isTopper;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", rank=" + rank + ", isTopper=" + isTopper + "]";
	}

}
