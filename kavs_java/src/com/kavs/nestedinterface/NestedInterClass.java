package com.kavs.nestedinterface;

public class NestedInterClass implements Myinter.Myinnerinter, ChildInter{
	@Override
	public void print() {
		System.out.println("This is inner interface method");
	}
	
	public void clculateArea(int a) {
		
			System.out.println("Area : "+ a*a);
	}

	public void Show() {
		
		System.out.println("This is from Child Interface Method.");
	}
}
