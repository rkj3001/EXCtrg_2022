package com.example;

import com.example.model.Student;

//import com.example.model.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram = new Student();
		
		//ram.rollNumber = 101;
		
		// public method able to access
		ram.setRollNumber(06020);
		//default method unable to access=> 
		//because student is in com.example.model package
		// and Application is in com.example package
		
		//ram.setMarkScored(06020);
		//Unable to access because the method is private in student Class
		
		//ram.setFirstName("rag");
		// Unable to access because Application is NOT a subclass
		//of student
		
		//System.out.println(ram.getRollNumber());
		System.out.println("Roll Number :"+ram.getRollNumber());
		
		System.out.println("mark scored :"+ram.getMarkScored());
		
		
		System.out.println("Student Name :"+ram.getFirstName());
		
		Student shyam = new Student(55, "shyam", 65666655, "cse");
		
		System.out.println("roll  no  "+shyam.getRollNumber());
		System.out.println("STU name  "+shyam.getFirstName());
		
		
		Student magesh = new Student(9555, "magesg", "ECE");
				
		System.out.println("roll  no  "+magesh.getRollNumber());
		System.out.println("STU name  "+magesh.getMarkScored());
		System.out.println("nd  roshan "+magesh.getFirstName());
		
		

	}

}
