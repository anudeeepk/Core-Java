package com.jsp.DoublyLinkedList;

public class MainDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedListImp l1=new DoublyLinkedListImp();
		
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.display();
		
		l1.deleteFront();
	}

}
