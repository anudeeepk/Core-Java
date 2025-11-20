package com.jspiders.chaining;
class Alpha
{
	Alpha()
	{
		System.out.println("Alpha() Constructor");
	}
	Alpha(int a)
	{
		System.out.println("Alpha(int) Constructor");
	}
}
class Beta extends Alpha
{
	Beta()
	{
		super();
		System.out.println("Beta() Constructor");
	}
}
public class MainclassAlphaBeta {
	public static void main(String[] args) {
		Beta ref=new Beta();
	}
	

}
