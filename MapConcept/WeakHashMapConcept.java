package com.technoelevate.MapConcept;

import java.util.*;

public class WeakHashMapConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WeakHashMap hm = new WeakHashMap();
		Temp t = new Temp();
		hm.put(t,"Souju");
		System.out.println(hm);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(hm);
	}

}
