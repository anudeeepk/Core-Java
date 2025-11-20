package com.jspiders.random;

public class SumOfNo {
	public static void main(String[] args) {
		String s="ab.cd.ef";
		String[] arr=s.split(".");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}