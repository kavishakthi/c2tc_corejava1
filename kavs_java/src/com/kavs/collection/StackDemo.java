package com.kavs.collection;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> ob = new Stack<Integer>();
		ob.push(55);
		ob.push(22);
		ob.push(21);
		ob.push(20);
		ob.push(33);
		
		System.out.println("Stack Elements: "+ ob);
		ob.pop();
		ob.pop();
		
		System.out.println("Stack Elements: "+ ob);
		System.out.println("Last Stack Element: "+ ob.peek());
		
		if(ob.isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack is not empty");
		}
		System.out.println(ob.search(22));
		System.out.println(ob.search(55));
		System.out.println(ob.search(42));
	}

}
