package com.mingrisoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(3, "JAVA", 21));
		list.add(new Employee(2, "JAVA", 22));
		list.add(new Employee(1, "JAVA", 23));
		System.out.println("Befor Sort: ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		System.out.println("After Sort:");
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
