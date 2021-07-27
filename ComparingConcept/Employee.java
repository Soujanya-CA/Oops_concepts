package com.technoelevate.ComparingConcept;

public class Employee {

	private int empId;
	private String name;
	private Double salary;
	
	public Employee(int empId, String name, Double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee name : " + this.name + " Employee salary : " + this.salary;
	}
	
	
}
