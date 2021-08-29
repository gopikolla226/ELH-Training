package com.service;

import com.model.College;
import com.model.Department;
import com.model.Student;

public interface DepartmentService {
public abstract Student searchStudentById(Department dep, int id);

public abstract Student searchStudentByName(Department department, String name);

public abstract Department searhDepartmentsByDepartmentId(College college1, String string);

}
