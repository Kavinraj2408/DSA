package com.linkedlist;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(77);
		list.insert(100);
		list.insert(88);
		list.insertAtStart(99);
		list.insertAt(2, 98);
		list.deleteAt(1);
		
		list.show();
		
	}

}
class Node{
	int data;
	Node next;
}

class LinkedList{
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void show() {
		Node node = head;
		
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}else {
			Node n = head;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
		}else {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("deleted element --> " + n1.data);
			n1 = null;			
		}
		
	}
	
}


