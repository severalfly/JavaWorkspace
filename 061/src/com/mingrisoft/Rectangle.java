package com.mingrisoft;

public class Rectangle extends Shape{
	private double height;
	private double weight;
	
	public Rectangle(double height, double weight) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public double getArea(){
		return  height * weight;
	}
}
