package com.jspiders.methodoverloading;

public class MainFaceboook {
	public static void main(String[] args) {
		FacebookWebsite web=new FacebookWebsite();
		DisplayManager.manage(web);
		FacebookMobile app=new FacebookMobile();
		DisplayManager.manage(app);
	}

}
