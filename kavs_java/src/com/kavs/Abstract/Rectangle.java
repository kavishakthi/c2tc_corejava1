package com.kavs.Abstract;

public class Rectangle extends Shape{
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	private float width, height;
	
	public Rectangle() {
		width = 0.5f;
		height = 0.9f;
	}

	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		super.area = width * height;
		
	}
	
}
