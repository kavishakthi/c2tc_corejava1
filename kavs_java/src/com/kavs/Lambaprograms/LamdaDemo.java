package com.kavs.Lambaprograms;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m = ()->{return "Hello";};
		System.out.println(m.greet());
		
		Cube c = (a)->{return (a*a*a);};
		System.out.println("Cube of num is"+ c.Calculate(5));
	}

}
