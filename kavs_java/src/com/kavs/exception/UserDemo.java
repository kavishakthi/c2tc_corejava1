package com.kavs.exception;

public class UserDemo {

	public static void main(String[] args)
	{
		try {
			Userdefined.validate();
		} catch (Age e) {
			System.out.println("caught the exception: "+ e.getMessage());
		}
	}
}
