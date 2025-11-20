package com.jsp.DoublyLinkedList;

public class DoublyLinkedListImp {
	Node head;
	Node tail;
	
	void insert(int ele) {
		Node n=new Node(ele);
		
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
		System.out.println(ele+" had been inserted into doubly Linked List");
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
	
	void displayReverse() {
		
		System.out.println("========LinkedList Data=========");
		if(head==null) {
			System.out.println("No LinkedList Present");
		}
		else {
			Node temp=tail;
			while(temp.prev!=null) {
				System.out.print(temp.data+"->");
				temp=temp.prev;
			}
			System.out.println(temp.data);
		}
		System.out.println("================================");
	}
	
	void inserFront(int ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			n.next=head;
			head.prev=n;
			head=n;
		}
	}
	
	void deleteFront() {
		if(head==null) {
			System.out.println("No Doubly Linked List Present");
		}
		else {
			System.out.println(head.data+" had been deleted");
			head=head.next;
			head.prev=null;
		}
	}

}
