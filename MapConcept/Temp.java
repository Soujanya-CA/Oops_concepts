package com.technoelevate.MapConcept;

public class Temp {

	@Override
	public String toString() {
		return "Temp";
	}
	
	public void finalize() {
		System.out.println("Finalize() called");
	}
	
	

}
