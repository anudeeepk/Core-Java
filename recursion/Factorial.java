package com.jspiders.recursion;


public class Factorial {
	static int sumN(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*sumN(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(sumN(4));
	}
}
