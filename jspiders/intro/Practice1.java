package com.jspiders.intro;

public class Practice1 {
	static int findPower(int base,int exp)
	{
		int power=1;
		for(int i=1;i<=exp;i++)
		{
			power=power*base;
		}
		return power;
		
	}
	public static void main(String[] args) {
		int n=15;
		int rem=0;
		int exp=2;
		int sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+findPower(rem,exp);
			n=n/10;
		}
		System.out.println(sum);
	}
}
