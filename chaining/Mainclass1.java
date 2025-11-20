package com.jspiders.chaining;
class Hotel
{
	Hotel()
	{
		System.out.println("McDonalds");
	}
	Hotel(int a)
	{
		this();
		System.out.println("KFC");
	}
	Hotel(double d)
	{
		this(10);
		System.out.println("Dominos");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Hotel ref= new Hotel();
	}

}
