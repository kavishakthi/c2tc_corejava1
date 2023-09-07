package com.kavs.Abstract;

public class Square extends Shape{
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	private float side;
	
	public Square() {
		side = 2.5f;
	}
	public Square(float side)
	{
		this.side = side;
	}
	@Override
	void calArea() {
		super.area = side * side;
	}
}
