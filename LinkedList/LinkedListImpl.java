package com.jsp.LinkedList;

public class LinkedListImpl {
	Node head;
	
	void insert(int ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(ele+"  had been inserted inside LinkedList");
	}
	
	
	void display() {
		System.out.println("========LinkedList Data=========");
		if(head==null) {
			System.out.println("No LinkedList Present");
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
		System.out.println("================================");
	}
	
	void delete() {
		if(head==null) {
			System.out.println("No LinkedList");
		}
		else if(head.next==null) {
			System.out.println(head.data+" had been deleted");
			head=null;
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			System.out.println(temp.next.data+" has been deleted");
			temp.next=null;
																													
		}
	}
	
	void insertFront(int ele) {
		Node n=new Node(ele);
		if(head== null) {
			head=n;
		}
		else {
			n.next=head;
			head=n;
		}
	}
	
	void deleteFront() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}
		else {
			head=head.next;
		}
	}
}
