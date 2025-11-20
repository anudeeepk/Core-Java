package com.jsp.map;

import java.util.LinkedHashMap;

public class OcuranceOfWords {
	public static void main(String[] args) {
		String s="hello hi bye hi hello bye bye bye";
		LinkedHashMap<String, Integer> m= new LinkedHashMap<String, Integer>();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String a=arr[i];
			if(m.containsKey(a)) {
				m.put(a, m.get(a)+1);
			}
			else {
				m.put(a, 1);
			}
		}
		for(String key:m.keySet()) {
			System.out.println(key+"-"+m.get(key));
		}
	}
}
