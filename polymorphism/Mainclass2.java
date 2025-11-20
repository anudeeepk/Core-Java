package com.jspiders.polymorphism;
class Launcher{
	void launch(int a) {
		System.out.println("Chrome");
	}
	void launch(double d) {
		System.out.println("Firefox");
	}
	void launch(String s) {
		System.out.println("Edge");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		Launcher ref=new Launcher();
		ref.launch(10);
		ref.launch(4.5);
		ref.launch("ABC");
	}

}
