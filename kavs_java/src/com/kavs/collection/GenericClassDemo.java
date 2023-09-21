package com.kavs.collection;

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericClass<String> strob = new GenericClass<String>();
		strob.set("KAviya here..");
		System.out.println(strob.get());
		
		GenericClass<Integer> intob = new GenericClass<Integer>();
		intob.set(40);
		System.out.println(intob.get());
	}

}
