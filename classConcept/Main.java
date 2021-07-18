package com.technoelevate.classConcept;

public class Main {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.setModel("GTX");
		System.out.println(bmw.getModel());
		
		Car audi = new Car();
		audi.setModel("AudiS");
		System.out.println(audi.getModel());
	}

}
