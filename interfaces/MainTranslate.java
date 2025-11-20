package com.jspiders.interfaces;

public class MainTranslate {
	public static void main(String[] args) {
		English e=new English();
		Kannada k=new Kannada();
		Hindi h=new Hindi();
		Google.convert(e,h);
		System.out.println("----------------------");
		Google.convert(h,k);
		System.out.println("----------------------");
		Google.convert(k, e);
	}

}
