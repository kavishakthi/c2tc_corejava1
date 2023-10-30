package com.kavs.comparator;
import java.util.*;

class Cartoon {
	
	public Cartoon(String name, float hours) {
		super();
		this.name = name;
		this.hours = hours;
	}
	
	public String toString() {
		return "Cartoon [name=" + name + ", hours=" + hours + "]";
	}
	String name;
	float hours;	
}

public class MyExample {
	
	public static void main(String args[])
	{
		Comparator<Cartoon> ob =(Cartoon a, Cartoon b) -> a.hours>b.hours?1:-1;
		
		//above one line code can also be written in this way 
		/*Comparator<Cartoon> ob = new Comparator<>()
		{
			public int compare(Cartoon a, Cartoon b)
			{
				if(a.hours>b.hours)
					return 1;
				else
					return -1;
			}
		};*/
		
		List<Cartoon> st = new ArrayList<Cartoon>();
		st.add(new Cartoon("Shinchan", 2.3f));
		st.add(new Cartoon("Doraemon", 1.2f));
		st.add(new Cartoon("Tom and Jerry", 1.5f));
		
		st.forEach(System.out::println);
	}
}
