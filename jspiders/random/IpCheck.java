package com.jspiders.random;

import java.util.Scanner;

public class IpCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int sum=0;
		int right=0;
		int left=0;
		int[][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
				if(i==j) {
					left=left+arr[i][j];
				}
				if(i+j==arr.length-1) {
					right=right+arr[i][j];
				}
			}
		}
		System.out.println("Sum of all elements:"+sum);
		System.out.println("Left Diagonal:"+left);
		System.out.println("left Diagonal:"+right);
	}
}
