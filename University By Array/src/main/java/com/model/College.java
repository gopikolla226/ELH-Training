package com.model;

public class College {
	private String collegeId;
	private String collegeName;
	private Department[] departments;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeId, String collegeName, Department[] departments) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
	}

	public String getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}

}
