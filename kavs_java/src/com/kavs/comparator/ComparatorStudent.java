package com.kavs.comparator;

public class ComparatorStudent {

	int rollNo;
	String name, address;
	public ComparatorStudent(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ComparatorStudent [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
