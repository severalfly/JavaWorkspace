package com.mingrisoft;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	@Override
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
}
