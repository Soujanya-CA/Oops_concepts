package com.technoelevate.constructors;

public class Account {
	
	private String accNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String phNumber;
	
	public Account() {
		this("1234",50000.00,"abc","abc@gmail.com","7777777");
	}
	
	public Account(String accNumber, double balance, String customerName, String customerEmail, String phNumber) {
		System.out.println("Complete constructor");		
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.phNumber = phNumber;
	}
	
	public Account(String customerName, String customerEmail, String phNumber) {
		this("1234",2000.00,customerName,customerEmail,customerEmail);
	}
	
	public void deposite(double depoAmount) {
		this.balance+=depoAmount;
		System.out.println("Amount deposited:"+depoAmount+". Updated balance in your account:"+this.balance);
	}
	
	public void withdraw(double withdrawalAmount) {
		if(this.balance<withdrawalAmount) {
			System.out.println("Insuffiecent balance");
		}else {
			this.balance=withdrawalAmount;
			System.out.println("withdrawl sucessfull:"+withdrawalAmount+". Updated balance in your account:"+this.balance);
		}
	}
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	
	
}
