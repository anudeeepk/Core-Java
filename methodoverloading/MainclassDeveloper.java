package com.jspiders.methodoverloading;

public class MainclassDeveloper {
	public static void main(String[] args) {
		FrontEndDeveloper fe=new FrontEndDeveloper();
		Manager.assignTask(fe);
		BackEndDeveloper be=new BackEndDeveloper();
		Manager.assignTask(be);
	}
}
