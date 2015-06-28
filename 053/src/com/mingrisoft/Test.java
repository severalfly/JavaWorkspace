package com.mingrisoft;

import java.awt.Color;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("JAVA", 12, 21, Color.BLACK);
		Cat cat2 = new Cat("C++", 12, 21, Color.BLUE);
		Cat cat3 = new Cat("C#", 12, 21, Color.RED);
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
	}

}
