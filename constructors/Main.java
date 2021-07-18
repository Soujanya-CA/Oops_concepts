package com.technoelevate.constructors;

public class Main {

	public static void main(String[] args) {
	
		Account acc = new Account();
		acc.setAccNumber("12345678");
		acc.setBalance(1000);
		acc.setCustomerEmail("abc@gmail.com");
		acc.setCustomerName("abc");
		acc.setPhNumber("7854965447");
		
		Account acc1 = new Account("1234",50000.00,"abc","abc@gmail.com","7777777");
		Account acc2 =new Account("4567","def@gmail.com","7855455");
		
		System.out.println(acc2.getBalance());
		acc2.withdraw(3000.00);
		acc2.deposite(50000.00);
		acc2.withdraw(3000.00);
		acc2.deposite(10000.00);

	}

}
