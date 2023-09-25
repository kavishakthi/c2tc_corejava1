package com.kavs.collection;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("Yellow");
		v.add("Green");
		v.add("red");
		System.out.println("vector elements: "+ v);
		int size = v.size();
		System.out.println("Size of vector: "+ size);
		
		int c = v.capacity(); 
		System.out.println("Default Capacity: "+ c);
		 
		v.addElement(null);
		
		v.add("white");
		v.add(5, "pink");
		
		System.out.println("vector elements: "+ v);
		
		v.add("Yellow");
		v.add("Green");
		v.add("red");
		v.add("white");
		v.add("white");
		
		int newsize = v.size();
		System.out.println("New size of vector :"+ newsize);
		
		int b = v.capacity();
		System.out.println("Default Capacity: "+ b);
	}

}
