package com.jspiders.abstraction;

public class MainclassAndroid {
	public static void main(String[] args) {
		Samsung s=new Samsung();
		SmartPhone.showProperties(s);
		Oppo o=new Oppo();
		SmartPhone.showProperties(o);
		Vivo v=new Vivo();
		SmartPhone.showProperties(v);
	}

}
