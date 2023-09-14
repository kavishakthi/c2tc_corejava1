package com.kavs.exception;

public class NestedTryCatch {

	public static void check()
	{
		String str = "LAMBORGINI";
		int length = str.length();
		System.out.println("String Length = "+ length);
		String Newstr = null;
		int z = 12;
		try
		{
			try
			{
				System.out.println(str.charAt(z));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Index out of bound : "+ e.getMessage());
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Error:"+ e.getMessage());
			}
			System.out.println("New length: "+Newstr.length());
		}
		catch(NullPointerException e) {
			System.out.println("Exception thrown: "+ e.getMessage());
		}
		
		
	}
	
}
