package com.kavs.comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Dell",16 ,20000));
		laps.add(new Laptop("Hp",12 ,18000));
		laps.add(new Laptop("Asus",14 ,21000));
		
		Collections.sort(laps);
		for(Laptop l:laps)
		{
			System.out.println(l);
		}
	}

}
