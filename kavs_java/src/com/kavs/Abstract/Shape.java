package com.kavs.Abstract;

public abstract class Shape {

	protected float area;
	//abstract method 
	abstract void calArea();
	
	void display()
	{
		System.out.println("Area of shape is:"+ area);
	}
}
