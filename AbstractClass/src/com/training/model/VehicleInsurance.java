package com.training.model;

public class VehicleInsurance extends Insurance {
	
	private String vehiceModel;
	private int yearOfManufacture;
	
	public VehicleInsurance() {
		super();
	}
	



	public VehicleInsurance(int policyNumber, String policyHolderName, String vehiceModel,
			int yearOfManufacture) {
		super(policyNumber, policyHolderName );
		this.vehiceModel = vehiceModel;
		this.yearOfManufacture = yearOfManufacture;
	}



	public String getVehiceModel() {
		return vehiceModel;
	}



	public void setVehiceModel(String vehiceModel) {
		this.vehiceModel = vehiceModel;
	}



	public int getYearOfManufacture() {
		return yearOfManufacture;
	}



	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}


	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium  = 1000;
		if(yearOfManufacture<2020 && vehiceModel.equals("car")) {
			premium = 2000;
			
		}
		return premium;
		
		
		
	}


}


