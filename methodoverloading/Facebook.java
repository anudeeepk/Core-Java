package com.jspiders.methodoverloading;

class Facebook {
	void display()
	{
		System.out.println("Display");
	}
}
class FacebookWebsite extends Facebook{
	void display()
	{
		System.out.println("Display in browser");
	}
}
class FacebookMobile extends Facebook{
	void display()
	{
		System.out.println("Display in Application");
	}
}

