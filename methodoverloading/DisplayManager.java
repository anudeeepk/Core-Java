package com.jspiders.methodoverloading;

public class DisplayManager {
	static void manage(Facebook fb)
	{
		if(fb!=null)
		{
			fb.display();
		}
	}
}
