package com.jspiders.intro;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		String s= "hi hello how are you";
		String[] arr=s.split(" ");
		String ans="";
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
			else
			{
				ans=arr[i];
				for(int j=0;i<ans.length();j++)
				{
					rev=s.charAt(j)+rev;
				}
				arr[i]=rev;
					System.out.print(arr[i]);
			}
		}
	}
}
