package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Student;
import com.cg.jpacrud.service.StudentService;
import com.cg.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
StudentService service = new StudentServiceImpl();
		
		Student student = new Student();
		
		student.setStudentid(300);
		student.setName("ammu");
		service.addStudent(student);
		
		student = service.findStudentById(100);
		System.out.print("ID:"+student.getStudentid());
		System.out.println(" Name:"+student.getName());
		
		//student = service.findStudentById(100);
		//service.removeStudent(student);
		//System.out.println("End of program/Life cycle completed...");
		
		
		
		
	}

}
