package com.training.model;

public  class LifeInsurance extends Insurance {

	private int age;
	
	
	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		
		double premium;
		// TODO Auto-generated method stub
		if(age<50) {
			premium = 5000;
		
		}else {
			premium = 10000;
			
		}
		return premium;
	}

	public LifeInsurance(int age) {
		super();
		this.age = age;
	}

	

}
