package com.jspiders.intro;

import java.util.Scanner;

public class Example1 {
		
	public static void main(String[] args) {
		int[] arr= {1,1,1,3,2,2};
		int count=1;
		int max=1;
		int ans=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				count=1;
			}
			if(count>max) {
				max=count;
				ans=arr[i];
			}
		}
		System.out.println(ans);
	}
}