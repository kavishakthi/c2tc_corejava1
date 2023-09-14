package com.kavs.exception;

public class Throws {

	void display()throws NumberFormatException,ArrayIndexOutOfBoundsException
	{
		int num = Integer.parseInt("Kaviya Here!!");
		int arr[] = {1, 3, 5, 2, 4};
		System.out.println(num);
		System.out.println(arr[5]);
		throw new NumberFormatException("using int for String");
		
		
		
	}
}
