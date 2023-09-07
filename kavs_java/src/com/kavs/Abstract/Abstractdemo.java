package com.kavs.Abstract;

public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Square sq = new Square();
		Rectangle r = new Rectangle();
		System.out.println(sq);
		sq.calArea();
		sq.display();
		
		System.out.println(r);
		r.calArea();
		r.display();
		
		Shape sh = new Square(6.75f);
		System.out.println(sh);
		sh.calArea();
		sh.display();
	}
}
