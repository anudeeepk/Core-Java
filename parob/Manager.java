package com.parob;

import java.util.Scanner;

public class Manager {
	static void displayPlayerDetails(Player p)
	{
		if(p!=null)
		{
			System.out.println("Jersey Number: "+p.jerseyNum);
			System.out.println("Name: "+p.name);
		}
	}
	static Player createPlayer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey Number: ");
		int jerseyNum=sc.nextInt();
		System.out.println("Enter Name: ");
		String name=sc.nextLine();
		Player p=new Player(jerseyNum,name);
		return p;
	}

}
