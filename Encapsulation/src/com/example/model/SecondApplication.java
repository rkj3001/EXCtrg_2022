package com.example.model;

public class SecondApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student shyam = new Student();//= new "Student" constructor
		
		shyam.setRollNumber(1011);
		shyam.setMarkScored(56);
		shyam.setFirstName("shyam");
		
		//shyam.setBranch("B.Tech");
		
		System.out.println("Roll Number :"+shyam.getRollNumber());
		
		System.out.println("mark Scored :"+shyam.getMarkScored());
		
	
		System.out.println("Student Name :"+shyam.getFirstName());
	}

}
