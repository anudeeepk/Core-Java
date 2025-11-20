package com.jspiders.intro;

import java.util.Scanner;

public class StringRem {
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,2,3,3};
		int count=1;
		int max=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
				}
				
				count=1;
				
			}
		}
		
	}
}
