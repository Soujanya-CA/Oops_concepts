package com.technoelevate.CursorConcept;

import java.util.*;

public class ListIteratorConcept {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.add("Messi");
		l1.add("Netmar");
		l1.add("Mbbape");
		l1.add("Ronaldo");
		
		//System.out.println(l1);
		
		ListIterator ltr = l1.listIterator();
		while(ltr.hasNext()) {
			String str = (String)ltr.next();
			if(str.equals("Ronaldo")) {
				ltr.remove();
			}
		}
		System.out.println(l1);
	}

}
