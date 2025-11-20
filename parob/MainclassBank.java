package com.parob;

public class MainclassBank {
	public static void main(String[] args) {
		Account a1=Bank.createAccount();
		Bank.displayAccountDetails(a1);
		System.out.println("=========================");
		Account a2=Bank.createAccount();
		Bank.displayAccountDetails(a2);
	}
}
