package com.parob;

import java.util.Scanner;

class Bank {
	static void displayAccountDetails(Account a)
	{
		if(a!=null)
		{
			System.out.println("Account number: "+a.accNum);
			System.out.println("Account Balance: "+a.accBal);
		}
	}
	static Account createAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		long accNum=sc.nextLong();
		System.out.println("Enter Account Balance: ");
		double accBal=sc.nextDouble();
		Account a=new Account(accNum,accBal);
		return a;
	}
}
