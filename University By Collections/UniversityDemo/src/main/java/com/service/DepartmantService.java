package com.service;

import java.util.List;

import com.exception.MyException;
import com.model.Department;
import com.model.Student;

public interface DepartmantService {
	public abstract Student searchStudent(Department department, int search)throws MyException; 

}
