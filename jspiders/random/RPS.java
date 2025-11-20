package com.jspiders.random;

import java.util.Scanner;

public class RPS {
	public static void main(String[] args) {
		String[] arr= {"Rock","Papper","Scissor"};
		int up=0,cp=0,r=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("=======Welcome to RPS Game=======");
		System.out.println("Please enter your target Score:");
		int t=sc.nextInt();
		System.out.println("Game Begins....!!");
		
		while(true)
		{
			System.out.println("=======Round:"+r+"=======");
			System.out.println("Player Enter Your Choice:");
			String ui=sc.next();
			String ci=arr[(int)(Math.random()*arr.length)];
			System.out.println(ci);
			if(ci.equals(ui))
			{
				System.out.println("Round Draw");
			}
			else if(ui.equals("Rock")&&ci.equals("Scissor")||ui.equals("Scissor")&&ci.equals("Papper")||ui.equals("Papper")&&ci.equals("Rock"))
			{
				System.out.println("User Won this Round");
				up++;
			}
			else
			{
				System.out.println("Computer Won this Round");
				cp++;
			}
			System.out.println("Points:");
			System.out.println("User:"+up+" Computer:"+cp);
			if(cp==t)
			{
				System.out.println("Computer win the Game!!");
				System.out.println("All the best For the next time");
				System.exit(0);
			}
			if(up==t)
				System.out.println("User win the Game!!");
				System.out.println("Well Played");
				System.exit(0);
			r++;
		}
	}
}
