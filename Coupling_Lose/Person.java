package com.technoelevate.Coupling_Lose;

public class Person {

	public static void main(String[] args) {
		 
		Transport transportation1 = new Bus();
		Transport transportation2 = new Train();
		
		Travel travel = new Travel(transportation2);
		travel.go();
	}
}
