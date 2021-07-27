package com.technoelevate.MapConcept;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		HashMap m = new HashMap();
		m.put(101, "Souju");
		m.put(102, "Soujanya");
		m.put(103, "Annappa");
		
		System.out.println(m);
		System.out.println(m.put(101, "Annappa"));
		System.out.println(m);
		
		Set s = m.keySet();
		System.out.println(s);
		
		Set s1 = m.entrySet();
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"......."+m1.getValue());
		}
	}

}
