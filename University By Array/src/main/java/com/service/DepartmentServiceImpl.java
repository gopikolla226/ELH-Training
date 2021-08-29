package com.service;

import com.model.College;
import com.model.Department;
import com.model.Student;

public class DepartmentServiceImpl implements DepartmentService {

	public Student searchStudentById(Department department, int id) {
		Student studentObj = null;
		Student[] studentArray = department.getStudent();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getStuId() == id) {
				studentObj = studentArray[i];
			} else {

			}
		}
		return studentObj;
	}

	public Student searchStudentById1(Department dep, int id) {
		Student batch2 = null;
		Student[] batchArray = dep.getStudent();
		for (int i = 0; i < batchArray.length; i++) {
			if (batchArray[i].getStuId() == id) {

				batch2 = batchArray[i];

			}
		}
		return batch2;

	}

	public Student searchStudentByName(Department department, String name) {
		Student studentObj = null;
		Student[] studentArray = department.getStudent();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getStuName() == name) {
				studentObj = studentArray[i];
			} else {

			}
		}
		return studentObj;
	}

//	 public Student[] searchStudentById(Department[] departments, int id) {
//	 Student[] studentObj = null;
//	 for (int i = 0; i < departments.length; i++) {
//	Student[] studentArray = departments[i].getStudent();
//	if (studentArray[i].getStuId() == id) {
//	 studentObj = studentArray[i];
//	 } else {
//	
//	}
//	}
//	return studentObj;
//	 }

	public Department searhDepartmentsByDepartmentId(College college1, String string) {
		Department dep = null;
		Department[] depArray = college1.getDepartments();
		for (int i = 0; i < depArray.length; i++) {
			dep = depArray[i];
		}

		return dep;
	}
}