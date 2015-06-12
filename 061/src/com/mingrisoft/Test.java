package com.mingrisoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(1);
		System.out.println("Name: " + circle.getName());
		System.out.println("Area: "+ circle.getArea());
		
		Rectangle rectangle = new Rectangle(1, 1);
		System.out.println("Name: " + rectangle.getName());
		System.out.println("Area: " + rectangle.getArea());
	}

}
