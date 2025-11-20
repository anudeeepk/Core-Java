package com.jspiders.methodoverloading;

public class Manager {
	static void assignTask(Developer dev)
	{
		if(dev!=null)
		{
			dev.develop();
		}
	}
}
