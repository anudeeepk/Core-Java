package com.jsp.map;

import java.util.LinkedHashMap;

public class OccuranceOfEleArr {
	public static void main(String[] args) {
		int[] arr= {5,6,2,3,4,5,5,6,1,1,6,5};
		LinkedHashMap<Integer, Integer> m=new LinkedHashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			int n=arr[i];
			if(m.containsKey(n)) {
				m.put(n, m.get(n)+1);
			}
			else {
				m.put(n, 1);
			}
		}
		for(int key:m.keySet()) {
			System.out.println(key+"-"+m.get(key));
		}
	}
}
