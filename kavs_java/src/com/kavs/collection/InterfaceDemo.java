package com.kavs.collection;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orange o = new Orange("Tangy");
		Myfruit<Orange> f1 = new Myfruit<Orange>();
		f1.fruit(o, o);

		Banana b = new Banana("Sweet");
		Myfruit<Banana> f2 = new Myfruit<Banana>();
		f2.fruit(b, b);
		
	}
}
