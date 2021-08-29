package com.model;

import java.util.List;

public class Department {
	private int departmentId;
	private String departmentName;
	private List<Student> students;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Department(int departmentId, String departmentName, List<Student> students) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.students = students;
	}



	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
