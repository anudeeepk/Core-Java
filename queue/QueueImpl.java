package com.jsp.queue;

import java.util.Scanner;

public class QueueImpl {
	static int[] queue;
	static int front;
	static int rear;
	
	static void createQueue(int size) {
		queue=new int[size];
		System.out.println("Queue created with size: "+size);
	}
	
	static void enqueue(int ele) {
		if(rear==queue.length) {
			System.out.println("full");
		}
		else {
			queue[rear]=ele;
			rear++;
			System.out.println(ele+" is inserted");
		}
	}
	
	static void dequeue() {
		if(rear==front) {
			System.out.println("No element");
		}
		else {
			System.out.println(queue[front]+" is deleted");
			for(int i=front;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			rear--;
		}
	}
	
	static void display() {
		System.out.print("Queue elements:");
		if(rear==front) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=front;i<rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
	}
	
	static void clear() {
		front=0;
		rear=0;
	}
	
	static boolean isEmpty() {
		if(front==rear) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isFull() {
		if(rear==queue.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("=============Welcome to Queue Data Structure=============");
//		System.out.print("Enter Your Size:");
//		int size=sc.nextInt();
//		createQueue(size);
//		System.out.println("1.enqueue()\n2.dequeue()\n3.display()\n4.clear()\n5.isEmpty()\n6.isFull()\n7.exit");
//		System.out.print("Enter The Operation:");
//		int op=sc.nextInt();
//		switch(op) {
//		case 1:System.out.println("Enter data to insert:");
//			   int ele=sc.nextInt();
//			   enqueue(ele);
//			   break;
//		case 2:dequeue();
//			   break;
//		case 3:display();
//               break;
//		case 4:display();
//		}
		createQueue(5);
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		System.out.println(isEmpty());
		System.out.println(isFull());
		
	}
}
