package com.mingrisoft;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassViewer {
	@SuppressWarnings("unchecked")
	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class<?> class1 = Class.forName("java.util.ArrayList");
		System.out.println("The standard name is: " + class1.getCanonicalName());
		
		Constructor[] constructors = class1.getConstructors();
		System.out.println("The contructors are: ");
		if (constructors.length != 0) {
			for (Constructor constructor : constructors) {
				System.out.println("\t"+constructor);
			}
		} else {
			System.out.println("\t" + "none!");
		}
		
		Method[] methods = class1.getDeclaredMethods();
		System.out.println("The Methods are: ");
		if (methods.length != 0) {
			for (Method method : methods) {
				System.out.println("\t" + method);
			}
		} else {
			System.out.println("\t" + "none!");
		}
	}

}
