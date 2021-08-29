package com.service;


import java.util.List;

import com.exception.MyException;
import com.model.Department;
import com.model.Student;

public class DepartmentServiceImpl implements DepartmantService {

	@Override
	public Student searchStudent(Department department, int search) throws MyException{
		
		Student details=null;
		List<Student> studentDetails= department.getStudents();
		
		for (Student student : studentDetails) {
			if(student.getStudentId()==search)
			{
			details=student;
			}
//			else
//			{
//				throw new MyException("No data");
//			}
		}
		
		
		return details;
	}

}
