package com.jspiders.polymorphism;
class Irctc{
	void search(int trainNo) {
		System.out.println("Train Details");
	}
	void search(String src,String dest) {
		System.out.println("Route Details");
	}
	void search(long pnr) {
		System.out.println("Ticket Details");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Irctc ref=new Irctc();
		ref.search(123456);
		ref.search("BLR","DEL");
		ref.search(123456789L);
	}

}
