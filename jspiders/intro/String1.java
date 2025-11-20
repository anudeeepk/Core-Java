package com.jspiders.intro;

public class String1 {
	public static void main(String[] args) {
		String s="He23@@sfj";
		int count=0;
		s=s.toLowerCase();
		int countalpha=0;
		int countnum=0;
		int counts=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				System.out.print(ch);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.print(ch);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z' || ch>='a' && ch<='z')==false && (ch>='0' && ch<='9')==false)
			{
				System.out.print(ch);
			}
		}
	}
}
