package com.kavs.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ComparatorStudent> ar = new ArrayList<ComparatorStudent>();
		ar.add(new ComparatorStudent(110, "krishna", "paris"));
		ar.add(new ComparatorStudent(131, "HariHaran", "New york"));
		ar.add(new ComparatorStudent(71, "Vasanth", "Germany"));
		ar.add(new ComparatorStudent(31, "Afzhal", "Spain"));
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("---------");
		for(int i=0; i<ar.size(); i++)
		{
			Collections.sort(ar, new SortbyRoll());
			System.out.println(ar.get(i));
		}
		System.out.println("---------");
		for(int i=0; i<ar.size(); i++)
		{
			Collections.sort(ar, new SortbyName());
			System.out.println(ar.get(i));
		}
	}

}
