package com.kavs.collection;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		double b = 40.37;
		
		Integer ob1 = Integer.valueOf(a);
		Double ob2 = Double.valueOf(b);
		
		if(ob1 instanceof Integer)
		{
			System.out.println("An object of Integer is created.");
		}
		if(ob2 instanceof Double)
		{
			System.out.println("An object of Double is created.");
		}
	}

}
