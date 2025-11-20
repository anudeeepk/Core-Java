package com.jspiders.stack;

public class BracketBalancing {
	static char[] stack;
	static int top;
		
	static void push(char ele) {
		top++;
		stack[top]=ele;
	}
	
	static void pop() {
		top--;
	}
	
	public static void main(String[] args) {
		String str="()()()()";
		stack=new char[str.length()];
		boolean flag=true;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			push(ch);
			if(ch=='(') {
				push('(');
			}
			else if(ch==')' && top==-1) {
				flag=false;
				break;
			}
			else {
				pop();
			}
		}
		
		if(top==-1 && flag==true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("unbalanced");
		}
	}

}
