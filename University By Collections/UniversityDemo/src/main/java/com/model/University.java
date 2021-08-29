package com.model;

import java.util.Set;

public class University {
	private int universityId;
	private String universityName;
	private Set<College> colleges;

	public University() {
		super();

	}

	public University(int universityId, String universityName, Set<College> colleges) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.colleges = colleges;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

}
