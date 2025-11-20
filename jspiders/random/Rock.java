package com.jspiders.random;

import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] arr= {"Rock","Papper","Scissor"};
		int up=0;
		int cp=0;
		int r=1;
		System.out.println("=====Welcome to the RPS Game=====");
		System.out.print("Please Enter your Target Score:");
		int target=sc.nextInt();
		System.out.println("Game Begins!!!");
		
		while(true)
		{
			System.out.println("=====Round:"+r+"=====");
			System.out.print("Enter Your Choice:");
			String ui=sc.next();
			String ci=arr[(int)(Math.random()*arr.length)];
			System.out.println("Computer Choice:"+ci);
			if(ci.equals(ui))
			{
				System.out.println("Round Draw!!!");
			}
			else if(ui.equals("Rock")&&ci.equals("Scissor") || ui.equals("Papper")&&ci.equals("Rock") || ui.equals("Scissor")&&ci.equals("Papper"))
			{
				System.out.println("User Win this Round");
				up++;
			}
			else
			{
				System.out.println("Computer Win this Round");
				cp++;
			}
			System.out.println("Points:");
			System.out.println("User:"+up+" Computer:"+cp);
			if(cp==target)
			{
				System.out.println("Computer Won the Game");
				System.out.println("Better Luck Next Time");
			}
			if(up==target)
			{
				System.out.println("User Won the Game!!!!!!");
				System.out.println("Winner Winner Chicken Dinner!!!!!!");
			}
			r++;
			System.out.println();
		}
	}
}
