package com.technoelevate.ComparingConcept;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new MyComparator());
		
		Employee e1 = new Employee(100, "Megha", 20000.00);
		Employee e2 = new Employee(101, "Bhanu", 10000.00);
		Employee e3 = new Employee(103, "Keerthi", 15300.40);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
