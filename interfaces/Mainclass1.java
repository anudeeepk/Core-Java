package com.jspiders.interfaces;
interface Delta{
	void disp();
	void help();
}
class Example implements Delta{
	@Override
	public void disp() {
		System.out.println("Executing disp");
	}

	@Override
	public void help() {
		System.out.println("Executing Help");
	}
	
}
public class Mainclass1 {
	public static void main(String[] args) {
		Delta ref=new Example();
		ref.disp();
		ref.help();
	}
}
