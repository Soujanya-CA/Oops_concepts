package com.technoelevate.ComparingConcept;

import java.util.*;

public class MyComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		int salaryDiff = (int)(emp2.getSalary()- (emp1.getSalary()));
		return salaryDiff;
	}
}
		
//		if(emp1.getSalary() > emp2.getSalary()) {
//			return -1;
//		}else if(emp1.getSalary() > emp2.getSalary()) {
//			return 1;
//		}else return 0;
//	}


