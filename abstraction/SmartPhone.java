package com.jspiders.abstraction;

public class SmartPhone {
	static void showProperties(Android a)
	{
		if(a!=null)
		{
			a.services();
			a.ui();
		}
	}
}
