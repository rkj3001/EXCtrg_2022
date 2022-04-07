package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {
	
	public static void printpremium(Insurance object) {
		
		
		System.out.println("premiumj "+object.calculatePremium());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleInsurance car = new VehicleInsurance(1010,"LOVE da","car",2019);
		printpremium(car);

		//double vehicle = car.calculatePremium();
		//System.out.println(car.getPolicyHolderName());
		//System.out.println(car.calculatePremium());
		
		LifeInsurance life = new LifeInsurance(1010,"loki",60);
		printpremium(life);
		
		String[] illness = {"ent","thyroid"};
		HealthInsurance health = new HealthInsurance(3030,"vicky",illness);
		printpremium(health);
	

}
}
