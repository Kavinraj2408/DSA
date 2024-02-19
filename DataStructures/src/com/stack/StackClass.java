package com.stack;

public class StackClass {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(99);
		stack.push(89);
		stack.push(95);
		stack.push(95);
		stack.push(85);
//		stack.push(95);
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.peak());
//		System.out.println("Size is --> " + stack.size());
//		System.out.println(stack.isEmpty());
		stack.show();
	}

}
class DStack{
	int capacity = 2;
	int stack[] = new int[capacity];
	int top=0;

	public void push(int i) {
//		System.out.println(top);
		if(top == stack.length) {
			System.out.println("Stack is full");
		}
		else {
			stack[top] = i;
			top++;
		}
	}	

	public int pop() {

		int data = 0;
		if(size() == 0) {
			
		}
		else {
			top--;
			data = stack[top];
			stack[top] = 0;			
		}
		return data;
	}
	public int peak() {
		int data;
		data = stack[top-1];
		return data;
	}

	public void show() {
		for(int n: stack) {
			System.out.print(n + " ");
		}
	}
	
	public int size(){
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
}

class Stack{
	int stack[] = new int[5];
	int top=0;

	public void push(int i) {
//		System.out.println(top);
		if(top == stack.length) {
			System.out.println("Stack is full");
		}
		else {
			stack[top] = i;
			top++;
		}
	}	

	public int pop() {

		int data = 0;
		if(size() == 0) {
			System.out.println("Stack is empty");
		}
		else {
			top--;
			data = stack[top];
			stack[top] = 0;			
		}
		return data;
	}
	public int peak() {
		int data;
		data = stack[top-1];
		return data;
	}

	public void show() {
		for(int n: stack) {
			System.out.print(n + " ");
		}
	}
	
	public int size(){
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
}
