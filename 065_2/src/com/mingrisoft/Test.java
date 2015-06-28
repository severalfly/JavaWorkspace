package com.mingrisoft;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The comman car:");
		Car car = new Car();
		car.setNameString("QQ");
		car.setSpeed(60);
		System.out.println(car);
		
		System.out.println("The GPS Car:");
		GPSCar gpsCar = new GPSCar();
		gpsCar.setNameString("BMW");
		gpsCar.setSpeed(120);
		gpsCar.getLocation();
		System.out.println(gpsCar);
		
	}

}
