package com.training;

import com.training.model.Student;
import com.training.services.ExceptionalHandling;
import com.training.services.StudentService;

public class Applicaion {

	public static void main(String[] args) {
		
		Student ram = new Student(1010,"ramesh",98);
		//System.out.println(ram.getMarkScored());

		StudentService service = new StudentService(ram);
		
		
		System.out.println(service.sendDetails());
		
		StudentService service2 = new StudentService();
		
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Name is not passed");
		}
		
		
		ExceptionalHandling exHandling = new ExceptionalHandling();
		exHandling.usingArrayIndexException(args);
	}

}
