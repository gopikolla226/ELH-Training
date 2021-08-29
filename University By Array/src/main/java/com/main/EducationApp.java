package com.main;


	import com.model.College;
	import com.model.Department;
	import com.model.Student;
	import com.service.DepartmentService;
	import com.service.DepartmentServiceImpl;

	public class EducationApp {
		public static void main(String[] args) {
			Student student1 = new Student(123, "Bhagavan", 25);
			Student student2 = new Student(456, "Mani", 5);
			Student student3 = new Student(789, "Krishna", 1);
			Student student4 = new Student(11, "Gopi", 32);
			Student student5 = new Student(12, "Teja", 31);

			Department department = new Department();
			department.setDeptId(100);
			department.setDeptName("ECE");
			Department dep = new Department();
			dep.setDeptId(101);
			dep.setDeptName("CSE");

			College college1 = new College();
			college1.setCollegeId("A20");
			college1.setCollegeName("VIT");

			College college2 = new College();
			college2.setCollegeId("B21");
			college2.setCollegeName("KLU");
			Department[] departments = new Department[2];
			departments[0] = department;
			departments[1] = dep;
			college1.setDepartments(departments);
			student1.setDepartment(department);
			student2.setDepartment(dep);
			Student[] students = new Student[3];
			students[0] = student1;
			students[1] = student2;
			students[2] = student3;
			department.setStudent(students);
			Student[] batch2 = new Student[2];
			batch2[0] = student4;
			batch2[1] = student5;
			dep.setStudent(batch2);

			DepartmentService departmentService = new DepartmentServiceImpl();

			Student student = departmentService.searchStudentById(department, 12);
			

			Department departmentObj = departmentService.searhDepartmentsByDepartmentId(college1, "A20");

			if (departmentObj != null) {
				System.out.println("College Name " + college1.getCollegeName());
				System.out.println("College id " + college1.getCollegeId());
				
				for (int i = 0; i < college1.getDepartments().length; i++) {
					
					System.out.println("Department Id" + departments[i].getDeptId());
					System.out.println("Department Name" + departments[i].getDeptName());


				}
				System.out.println();
			}

			Student batch = departmentService.searchStudentById(dep, 11);
			if (batch != null) {
				System.out.println("student id " + batch.getStuId());
				System.out.println("student name " + batch.getStuName());
				System.out.println("student age " + batch.getStuAge());
		
				System.out.println("student departmentid " + dep.getDeptId());
				System.out.println("student department Name " + dep.getDeptName());
				System.out.println("student collegeName " + college1.getCollegeName());
			}
			if (student != null) {
				System.out.println("student id " + student.getStuId());
				System.out.println("student name " + student.getStuName());
				System.out.println("student age " + student.getStuAge());
				System.out.println("student departmentid " + department.getDeptId());
				System.out.println("student department Name " + department.getDeptName());
			}
			
			Student studentObj = departmentService.searchStudentByName(department, "Gopi");
			if (studentObj != null) {
				System.out.println("student id " + studentObj.getStuId());
				System.out.println("student name " + studentObj.getStuName());
				System.out.println("student age " + studentObj.getStuAge());
				System.out.println("student departmentid " + department.getDeptId());
				System.out.println("student department Name " + department.getDeptName());
			}

		}


}
