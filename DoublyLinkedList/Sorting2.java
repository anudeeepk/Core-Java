package com.jsp.DoublyLinkedList;

public class Sorting2 {
	public static void main(String[] args) {
		int[] arr1= {3,8,18,23};
		int[] arr2= {4,5,15};
		int[] temp=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				temp[k]=arr1[i];
				i++;
			}
			else {
				temp[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length) {
			temp[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			temp[k]=arr1[i];
			j++;
			k++;
		}
		for(int ele:temp) {
			System.out.println(ele);
		}
	}
}
