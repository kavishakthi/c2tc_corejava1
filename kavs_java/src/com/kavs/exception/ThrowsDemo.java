package com.kavs.exception;

public class ThrowsDemo {

	
	public static void main(String[] args) 
	{
		Throws ob = new Throws();
		try
		{
			ob.display();
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Exception caught: "+ e1.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Exception caught: "+ e2.getMessage());
		}
		}
}
