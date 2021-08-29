package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.exception.MyException;
import com.model.College;
import com.model.Department;
import com.model.Student;
import com.model.University;
import com.service.DepartmantService;
import com.service.DepartmentServiceImpl;

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		int idNo = scan.nextInt();
		Student student1 = new Student(11, "Gopi", 22);
		Student student2 = new Student(12, "Krishna", 23);
		Student student3 = new Student(13, "Bhagavan", 24);
		Student student4 = new Student(14, "Teja", 25);
		Student student5 = new Student(15, "Mani Kiran", 26);

		Student student6 = new Student(16, "Harsha", 22);
		Student student7 = new Student(17, "Sai Varun", 23);
		Student student8 = new Student(18, "Nagerndra", 24);
		Student student9 = new Student(19, "Mike", 25);
		Student student10 = new Student(20, "Venkat", 26);

		Student student11 = new Student(21, "Tom", 22);
		Student student12 = new Student(22, "Ben", 23);
		Student student13 = new Student(23, "King", 24);
		Student student14 = new Student(24, "Robert", 25);
		Student student15 = new Student(25, "Mike", 26);

		Student student16 = new Student(26, "Sai", 22);
		Student student17 = new Student(27, "Sai", 23);
		Student student18 = new Student(28, "Mike", 24);
		Student student19 = new Student(29, "Kevin", 25);
		Student student20 = new Student(30, "Varun", 26);

		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);
		students.add(student8);
		students.add(student9);
		students.add(student10);
		students.add(student11);
		students.add(student12);
		students.add(student13);
		students.add(student14);
		students.add(student15);
		students.add(student16);
		students.add(student17);
		students.add(student18);
		students.add(student19);
		students.add(student20);

		Department department1 = new Department(101, "CSE", students);
		Department department2 = new Department(102, "IT", students);
		Department department3 = new Department(201, "EEE", students);
		Department department4 = new Department(202, "ECE", students);
		Set<Department> departments = new HashSet<>();
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		departments.add(department4);
		Department department = new Department();
		department.setStudents(students);

		College college1 = new College(1001, "VIT", departments);
		College college2 = new College(1002, "URCE", departments);
		Set<College> colleges = new HashSet<>();
		colleges.add(college1);
		colleges.add(college2);
		College college = new College();
		college.setDepartments(departments);

		University university = new University(1234, "JNTUK", colleges);
		university.setColleges(colleges);

		DepartmantService departmentService = new DepartmentServiceImpl();
		//Student info = null;
		try {
			Student info = departmentService.searchStudent(department, idNo);

			if (info != null) {

				if (info.getStudentId() >= 11 && info.getStudentId() <= 15) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department1.getDepartmentId());
					System.out.println("Department name is : " + department1.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());

				}

				else if (info.getStudentId() >= 16 && info.getStudentId() <= 20) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college1.getCollegeId());
					System.out.println("College name is : " + college1.getCollegeName());
					System.out.println("Department Id is : " + department2.getDepartmentId());
					System.out.println("Department name is : " + department2.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 21 && info.getStudentId() <= 25) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				} else if (info.getStudentId() >= 26 && info.getStudentId() <= 30) {
					System.out.println("University Id is :" + university.getUniversityId());
					System.out.println("University name is : " + university.getUniversityName());
					System.out.println("College Id is : " + college2.getCollegeId());
					System.out.println("College name is : " + college2.getCollegeName());
					System.out.println("Department Id is : " + department3.getDepartmentId());
					System.out.println("Department name is : " + department3.getDepartmentName());
					System.out.println("The Id Number of the Student is : " + info.getStudentId());
					System.out.println("The Name of the Student is : " + info.getStudentName());
					System.out.println("The Age of the Student is : " + info.getStudentAge());
				}
				
			}
			else
			{
				System.err.println("No Data Found");
			}
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
