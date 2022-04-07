package com.example.model;

public class Student {

	private int rollNumber;
	private String firstName;//camelCasing using 2 word 2nd one must caps//
	private double markScored;
	private String branch;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNumber, String firstName, double markScored, String branch) {
		super();
//super class of object class
		//this(); only one can be used.
 		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		this.branch = branch;
	}
	
	public Student(int rollNumber, String firstName, String branch) {
		this(rollNumber,firstName,99,branch);
 		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.branch = branch;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	 void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarkScored() {
		return markScored;
	}
	protected void setMarkScored(double markScored) {
		this.markScored = markScored;
		
	}
	public String getBranch() {
		return branch;
	}
	private void setBranch(String branch) {
		this.branch = branch;
	}
	
}
