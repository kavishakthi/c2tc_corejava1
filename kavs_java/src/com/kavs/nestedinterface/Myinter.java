package com.kavs.nestedinterface;

public interface Myinter {

	void clculateArea(int a);
	
	interface Myinnerinter{
		int id = 20;
		void print();
	} 
}
