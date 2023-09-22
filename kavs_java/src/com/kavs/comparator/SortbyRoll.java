package com.kavs.comparator;

import java.util.Comparator;

public class SortbyRoll implements Comparator<ComparatorStudent>{
	
	@Override
	public int compare(ComparatorStudent a, ComparatorStudent b) {
		// TODO Auto-generated method stub
		return b.rollNo-a.rollNo;
	}
}
