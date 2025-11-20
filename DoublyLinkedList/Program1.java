//Given two sorted array merge of any size them into single sorted array.Complexity should be -O(n)
//
//i/p 1->{3,8,18,23}
//i/p 2->{4,5,15}

//o/p->{3,4,5,8,15,18,23}

package com.jsp.DoublyLinkedList;

public class Program1 {
	int[] arr1= {3,8,18,23};
	int[] arr2= {4,5,15};
	int[] temp=new int[arr1.length+arr2.length];
	
	int i=0;
	int j=0;
	
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
}
