package com.mingsoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("克隆之前: ");
		Ex054Employee employee = new Ex054Employee();
		employee.setName("张XX");
		employee.setAge(30);
		System.out.println("The first Information:");
		System.out.println(employee);
		
		System.out.println("克隆之后: ");
		Ex054Employee employee2 = employee;
		employee2.setName("李XX");
		employee2.setAge(24);
		System.out.println("The First Information: ");
		System.out.println(employee);
		System.out.println("The Second Information: ");
		System.out.println(employee2);
	}

}
