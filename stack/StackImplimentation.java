package com.jspiders.stack;

public class StackImplimentation {
	
	static int[] stack;
	static int top;
	static void createStack(int size) {
		stack=new int[size];
		top=-1;
		System.out.println("Stack has been created with size:"+size);
	}
	static void push(int ele) {
		if(top==stack.length-1) {
			System.out.println("Stack overflow");
		}
		else {
			top++;
			stack[top]=ele;
			System.out.println(ele+" hasbeen inserted");
		}
	}
	static void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println(stack[top]+" has been deleted");
//			stack[top]=0;
			top--;
		}
	}
	
	static void display() {
		System.out.print("Stack elements: ");
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.print(stack[i]+" ");
			}
		}
	}
	
	static void isEmpty() {
		if(top==-1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
	static void isFull() {
		if(top==stack.length-1) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	static void peek() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Top: "+stack[top]);
		}
	}
	
	static void clear() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top;i>=0;i--) {
				top--;
			}
		}
	}
	
	public static void main(String[] args) {
		createStack(5);
		push(10);
		push(20);
		push(30);
	}
}
