package com.jspiders.interfaces;
class Helper{
	void help() {
		System.out.println("Executing Help()...");
	}
}
interface Writable{
	void write();
}
class Utility extends Helper implements Writable
{
	@Override
	public void write()
	{
		System.out.println("Executing write()....");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Utility ref=new Utility();
		ref.write();
	}
}
