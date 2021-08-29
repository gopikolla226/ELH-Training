package com.model;

public class Department {
	private int deptId;
	private String deptName;
	private Student[] student;

	public Department(int deptId, String deptName, Student[] student) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.student = student;
	}

	public Department() {
		super();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

}
