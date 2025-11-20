package com.jspiders.encapsulation;

public class MainAccount {
	public static void main(String[] args) {
		Account a1=new Account();
		a1.setAccountNumber(123456789);
		a1.setAccountBalance(10000.0);
		System.out.println(a1.getAccountNumber());
		System.out.println(a1.getAccountBalance());
	}

}
