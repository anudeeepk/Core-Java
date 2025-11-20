package com.jspiders.interfaces;

public class Google {
	static void convert(Language from,Language to)
	{
		if(from!=null && to!=null)
		{
			from.translate();
			System.out.println("to");
			to.translate();
		}
	}

}
