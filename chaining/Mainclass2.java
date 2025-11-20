package com.jspiders.chaining;
class Delta
{
	Delta()
	{
		System.out.println("Delta() Constructor");
	}
}
class Example extends Delta
{
	Example()//Implicitly called By the compiler
	{
		System.out.println("Example() Constructor");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Example ex=new Example();
	}

}
