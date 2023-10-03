package com.kavs.collection;
import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numberHashset = new HashSet<Integer>();
		numberHashset.add(20);
		numberHashset.add(80);
		numberHashset.add(60);
	
		System.out.println(numberHashset);
		
		HashSet<Integer> numberHashset1 = new HashSet<Integer>();
		numberHashset1.add(10);
		numberHashset1.add(60);
		numberHashset1.add(26);
		numberHashset1.add(44);
		System.out.println(numberHashset1);
		
		HashSet<Integer> numberHashset2= new HashSet<Integer>();
		numberHashset2.add(31);
		numberHashset2.add(43);
		numberHashset2.add(26);
		System.out.println(numberHashset2);
		
		//union
		numberHashset2.addAll(numberHashset);
		System.out.println("Set union: "+ numberHashset2);
		
		//intersection
		numberHashset1.retainAll(numberHashset2);
		System.out.println("Set intersection: "+numberHashset1);
		
		//set difference
		numberHashset2.removeAll(numberHashset);
		System.out.println("Set difference: "+numberHashset2);
	}

}
