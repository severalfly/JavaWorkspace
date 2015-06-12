package com.mingrisoft;

import java.sql.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setNameString("Leon");
		employee.setSalary(100);
		employee.setBirthdayDate(new Date(1990, 5, 21));
		
		Manager manager = new Manager();
		manager.setSalary(3000);
		manager.setNameString("Megan");
		manager.setBouns(2000);
		manager.setBirthdayDate(new Date(1987, 3, 1));
		
		System.out.println("E's Name: " + employee.getNameString());
		System.out.println("E's Salary: " + employee.getSalary());
		System.out.println("E's B: " + employee.getBirthdayDate());
		
		System.out.println("M's Name: " + manager.getNameString());
		System.out.println("M's Salary: "+ manager.getSalary());
		System.out.println("M's B:" + manager.getBirthdayDate());
		System.out.println("M's Bouns: " + manager.getBouns());
	}

}
