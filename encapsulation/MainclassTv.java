package com.jspiders.encapsulation;
class Cell
{
	void change()
	{
		System.out.println("Cell is being changed");
	}
}
class Remote
{
	Cell c;
	Remote(Cell c)
	{
		this.c=c;
	}
}
class Television
{
	Remote r=new Remote(new Cell());
}
public class MainclassTv {
	public static void main(String[] args) {
		Television tv=new Television();
		tv.r.c.change();
	}
}
