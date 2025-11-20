package com.jspiders.methodoverloading;

public class Developer {
	void develop() {
		System.out.println("developing...");
	}
}
class FrontEndDeveloper extends Developer{
	void develop() {
		System.out.println("UI/UX development");
	}
}
class BackEndDeveloper extends Developer{
	void develop() {
		System.out.println("Logic+Databace Development");
	}
}
