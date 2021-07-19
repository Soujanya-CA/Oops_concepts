package com.technoelevate.polymorphism;

public class Compiletime {

	public static void main(String[] args) {
		Compiletime ctp = new Compiletime();
		System.out.println(ctp.multiply(2, 3));
		System.out.println(ctp.multiply(5, 6, 7));

	}
	public int multiply(int i, int j) {
		return i*j;
	}
	public int multiply(int i, int j,int k) {
		return i*j*k;
	}

}
