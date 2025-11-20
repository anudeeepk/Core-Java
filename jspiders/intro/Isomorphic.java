package com.jspiders.intro;

public class Isomorphic {
	public static void main(String[] args) {
		String s1="jjkkjjjl";
		String s2="ppggyyyf";
		int c1=1;
		int c2=1;
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)!=s1.charAt(i+1)) {
				c1++;
			}
		}
		for(int i=0;i<s2.length()-1;i++) {
			if(s2.charAt(i)!=s2.charAt(i+1)) {
				c2++;
			}
		}
		int[] arr1=new int[c1];
		int[] arr2=new int[c2];
		if(c1!=c2) {
			System.out.println("not isomorphic");
		}
		int k=0;
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)==s1.charAt(i+1)) {
				arr1[k]++;
				k++;
			}
		}
		int m=0;
		for(int i=0;i<s2.length()-1;i++) {
			if(s2.charAt(i)==s2.charAt(i+1)) {
				arr1[m]++;
				m++;
			}
		}
		boolean flag=false;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("isomorphic");
		}
		else {
			System.out.println("isomorphic");
		}
	}
}
