package com.parking;

public class Main {

	public static void main(String[] args) {
		ParkingLotImpl parkingLot = new ParkingLotImpl(5, 5);

		Vehicle bus1 = new Vehicle("Bus001", "Yellow", VehicleType.Bus);
		Vehicle bus2 = new Vehicle("Bus002", "Blue", VehicleType.Bus);
		Vehicle bus3 = new Vehicle("Bus003", "Red", VehicleType.Bus);

		Vehicle car1 = new Vehicle("Car001", "White", VehicleType.Car);
		Vehicle car2 = new Vehicle("Car002", "Green", VehicleType.Car);
		Vehicle car3 = new Vehicle("Car003", "Red", VehicleType.Car);

		Vehicle sports1 = new Vehicle("Sports001", "Yellow", VehicleType.Sports);
		Vehicle sports2 = new Vehicle("Sports002", "Red", VehicleType.Sports);
		Vehicle sports3 = new Vehicle("Sports003", "Blue", VehicleType.Sports);

		System.out.println(parkingLot.addVehicle(1, car1));
		System.out.println(parkingLot.addVehicle(1, car2));
		System.out.println(parkingLot.addVehicle(2, bus1));
		System.out.println(parkingLot.addVehicle(8, sports2));
		System.out.println(parkingLot.addVehicle(3, sports1));
		System.out.println(parkingLot.addVehicle(5, sports3));

		parkingLot.removeVehicle("Car002");

		System.out.println("Availability on floor 1 for car: " + parkingLot.checkAvailability(1, VehicleType.Car));
		System.out
				.println("Availability on floor 2 for sports: " + parkingLot.checkAvailability(2, VehicleType.Sports));
	}

}
