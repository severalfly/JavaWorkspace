package com.mingrisoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before: ");
		Address address = new Address("China", "hubei", "wuhan");
		Employee employee1 = new Employee("zhang", 25, address);
		System.out.println("The first Information: ");
		System.out.println(employee1);
		
		System.out.println("After: ");
		Employee employee2 = employee1.clone();
		employee2.getAddress().setState("China");
		employee2.getAddress().setProvince("Sichuan");
		employee2.getAddress().setCity("ChengDu");
		employee2.setNamString("LiXX");
		employee2.setAge(24);
		
		System.out.println("The First Information:");
		System.out.println(employee1);
		System.out.println("The Second Information:");
		System.out.println(employee2);
	}

}
