package com.training.services;

import com.training.exception.RangeCheckException;

public class ExceptionalHandling {
	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed [a, b, c]");
			//e.printStackTrace();
		}
	
	}
	
	
	public void usingNumberFormatException(String value) {
		
		int age=0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			
			System.err.println("no foury five is not accepted give 45 instead");
			//e.printStackTrace();
		}
		
		System.out.println(age);
	}
	
	public void usingFinallyBlock() {
		
		int demoninator= 0;
		try {
			
			System.out.println(4/demoninator);
			
		} catch (ArithmeticException e) {
			
			System.err.println("demoninator should not be zero");		
			}
		finally {
			System.out.println("Inside FINALLY = = = = ");
		}
		
		System.out.println("Thanks,bye,bye");
	}
	
	public String underStandFinallyBlock()throws Exception {
		
		int demoninator= 0;
		try {
			
			System.out.println(4/demoninator);
			
		} catch (ArithmeticException e) {
			
			System.err.println("demoninator should not be zero");		
			//return "welcome";
			throw new RangeCheckException("welcome rahul");
			}
		finally {
			System.out.println("Inside FINALLY = = = = ");
		}
		
		System.out.println("Thanks,bye,bye");
		
		return "thanks";
		
	}

}


