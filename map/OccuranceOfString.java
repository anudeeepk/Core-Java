package com.jsp.map;

import java.util.LinkedHashMap;

public class OccuranceOfString {
	public static void main(String[] args) {
		
		LinkedHashMap<Character, Integer> m=new LinkedHashMap<Character, Integer>();
		String s="hello";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}
			else {
				m.put(ch, 1);
			}
		}
		for(char key:m.keySet()) {
		System.out.println(key+"-"+m.get(key));
		}
	}
}
