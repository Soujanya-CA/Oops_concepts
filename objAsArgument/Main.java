package com.technoelevate.objAsArgument;

public class Main {

	public static void main(String[] args) {
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(50,60,70);
		
		System.out.println(b2.isEqualBox(b1));

	}

}
