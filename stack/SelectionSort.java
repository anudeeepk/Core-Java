package com.jspiders.stack;

public class SelectionSort {
	
	static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {4,6,5,2,1,3};
		
		sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
