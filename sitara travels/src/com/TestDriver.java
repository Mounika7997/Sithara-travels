package com;

import java.util.ArrayList;

public class TestDriver {

	private static final Driver DRIVER = new Driver("Car", 111, "Thomas", 100.03);
	public static ArrayList<Driver> driverList = new ArrayList<>();

	public static void main(String[] args) {
		prepareTestData();
		Travel travel = new Travel();
		boolean result = travel.isCarDriver(DRIVER);

		System.out.println("Is car driver " + result);

		String answer = travel.retrieveByDriverId(driverList, 1110);

		System.out.println(answer);

		int retriveCountOfDriver = travel.retrieveCountOfDriver(driverList, "Lorry");

		System.out.println("retriveCountOfDriver : " + retriveCountOfDriver);

		ArrayList<Driver> retriveDriver = travel.retrieveDriver(driverList, "Lorry");

		System.out.println(retriveDriver);

		Driver retriveMaximumDistanceTravelledDriver = travel.retriveMaximumDistanceTravelledDriver(driverList);

		System.out.println(retriveMaximumDistanceTravelledDriver);

	}

	private static void prepareTestData() {
		Driver driver1 = DRIVER;

		Driver driver2 = new Driver("Truck", 112, "Mickel", 110.15);

		Driver driver3 = new Driver("Lorry", 113, "Mike", 430.25);

		Driver driver4 = new Driver("Lorry", 114, "Titus", 21000.35);

		driverList.add(driver1);
		driverList.add(driver2);
		driverList.add(driver3);
		driverList.add(driver4);
	}

}
