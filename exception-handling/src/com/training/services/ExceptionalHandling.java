package com.training.services;

public class ExceptionalHandling {
	
	public void usingArrayIndexException(String[] args) {
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Method requires three values to be passed [a, b, c]");
			//e.printStackTrace();
		}
	
	}

}