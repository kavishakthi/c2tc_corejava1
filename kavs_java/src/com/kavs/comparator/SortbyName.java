package com.kavs.comparator;

import java.util.Comparator;

public class SortbyName implements Comparator<ComparatorStudent>{

	@Override
	public int compare(ComparatorStudent a, ComparatorStudent b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}

}
