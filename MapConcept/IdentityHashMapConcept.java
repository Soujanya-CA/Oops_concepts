package com.technoelevate.MapConcept;

import java.util.*;

public class IdentityHashMapConcept {

	public static void main(String[] args) {
		
		IdentityHashMap I = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		I.put(I1,"Souju");
		I.put(I2, "Annappa");
		System.out.println(I);
	}

}
