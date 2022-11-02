package com;

import java.util.ArrayList;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equals("Car");
	}

	public String retrieveByDriverId(ArrayList<Driver> driverList, int driverId) {

		for (Driver driver : driverList) {

			if (driver.getDriverId() == driverId) {
				return "Driver name is " + driver.getDriverName() + " Belonging to the category " + driver.getCategory()
						+ "traveled " + driver.getTotalDistance() + " KM so far.";

			}
		}
		return "OOPS ! ..No driver found with the given id";
	}

	public int retrieveCountOfDriver(ArrayList<Driver> driverList, String category) {
		int numberOfDriver = 0;

		for (Driver driver : driverList) {
			if (driver.getCategory().equals(category)) {
				numberOfDriver++;
			}
		}

		return numberOfDriver;
	}

	public ArrayList<Driver> retrieveDriver(ArrayList<Driver> driverList, String category) {
		ArrayList<Driver> categorySpecificDrivers=new ArrayList<>();

		for (Driver driver : driverList) {
			if (driver.getCategory().equals(category)) {
				categorySpecificDrivers.add(driver);
			}
		}
		return categorySpecificDrivers;

	}

	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driverList) {
		Driver maxDistanceTravelled=driverList.get(0);
		for (Driver driver : driverList) {
			if (driver.getTotalDistance() > maxDistanceTravelled.getTotalDistance()) {
				maxDistanceTravelled=driver;
			}
		}
		return maxDistanceTravelled;
	}

}
