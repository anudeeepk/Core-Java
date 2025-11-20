package com.jspiders.intro;

//import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int n=10;
		int dec=0;
		int k=1;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			dec=dec+(rem*k);
			k=k*2;		
		}
		System.out.println(dec);
	}
}
