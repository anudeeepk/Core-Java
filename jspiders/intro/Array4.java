package com.jspiders.intro;

import java.util.Scanner;
//i/p: hello  3
//o/p:llollollo

public class Array4 {
	public static void main(String[] args) {
		String s="abcdef";
		String ans="";
		int n=4;
		int m=s.length()-n;
		for(int i=s.length()-1;i>=m;i--)
		{
			char ch=s.charAt(i);
			ans=ch+ans;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ans);
		}
	}
}
