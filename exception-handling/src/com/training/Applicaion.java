package com.training;

import java.util.Scanner;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionalHandling;
import com.training.services.StudentService;

public class Applicaion {

	public static void main(String[] args)throws Exception {
		
		Student ram = null;
		try {
			ram = new Student(1010,"ramesh",98);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
		//System.out.println(ram.getMarkScored());

		StudentService service = new StudentService(ram);
		
		
		System.out.println(service.sendDetails());
		
		StudentService service2 = null ;
		try {
			service2 = new StudentService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
		}
		
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.err.println("Name is not passed");
		}
		
		
		ExceptionalHandling exHandling = new ExceptionalHandling();
		//exHandling.usingArrayIndexException(args);
		
	//	exHandling.usingNumberFormatException("45");
		
		System.out.println(exHandling.underStandFinallyBlock());
	//Since we are using try with resourse - Scanner will be closed	
		
		try(Scanner scan =  new Scanner(System.in)){
			
			System.out.println("Enter Number");
			int num = scan.nextInt();
			
			System.out.println(num);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

		
		
	}

}
