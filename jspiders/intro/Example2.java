package com.jspiders.intro;

public class Example2 {
	public static void main(String[] args) {
		String s="malayalam";
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			ans=ans+ch;
		}
		if(s.equals(ans))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
