package com.jspiders.intro;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==13) {
				continue;
			}
			sum=sum+arr[i];
		}
		System.out.println("Sum:"+sum);
	}
}
