package com.mingrisoft;

import java.lang.reflect.Modifier;

public class NestedClassInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class<?> class1 = Class.forName("java.awt.geom.Point2D");
		Class<?>[] classes = class1.getDeclaredClasses();
		for (Class<?> class2 : classes) {
			System.out.println("The standard name is: " + class2.getCanonicalName());
			System.out.println("The Di is: " + Modifier.toString(class2.getModifiers()));
		}
	}

}
