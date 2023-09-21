package com.kavs.collection;
import java.util.ArrayList;

public class Generics {

	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>();
		//l.add(2);
		l.add("Hello All");
		for(String str : l)
		{
			System.out.println(str);
		}
	}
}
