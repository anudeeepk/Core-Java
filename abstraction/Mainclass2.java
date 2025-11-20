package com.jspiders.abstraction;
abstract class Delta
{
	void play() {
		System.out.println("Executing play()");
	}
	void start() {
		System.out.println("Executing Start()");
	}
}
class Example extends Delta
{
	
}
public class Mainclass2 {
	public static void main(String[] args) {
		Delta ref=new Example();
		ref.play();
		ref.start();
	}
}
