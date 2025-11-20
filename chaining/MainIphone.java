package com.jspiders.chaining;
class Iphone
{
	Iphone()
	{
		this(10);
		System.out.println("Max");
	}
	Iphone(int a)
	{
		System.out.println("Pro"); 
	}
	Iphone(boolean b)
	{
		System.out.println("Iphone");
	}
}
public class MainIphone {
	public static void main(String[] args) {
		Iphone ref=new Iphone();
	}
	

}
