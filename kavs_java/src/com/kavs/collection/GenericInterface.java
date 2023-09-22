package com.kavs.collection;

public interface GenericInterface<T>{

	public void fruit(T name, Orange o);
}

class Myfruit<T> implements GenericInterface<T>
{ 
	
	public void fruit(T name, Orange o) {
		
		String n = name.getClass().getName();
		System.out.println(n);
		System.out.println(o);
	}
}

class Orange{
	String taste;
	public Orange(String taste) {
		super();
		this.taste = taste;
	}
	
	@Override
	public String toString() {
		return "Orange [taste=" + taste + "]";
	}
}
class Banana extends Orange{
	public Banana(String taste) {
		super(taste);
	}
	@Override
	public String toString() {
		return "Banana [taste=" + taste + "]";
	}
}
