package com.parking;

public interface ParkingLot {

	public boolean checkAvailability(int floorNumber, VehicleType type);

	public String addVehicle(int floorNumber, Vehicle vehicle);

	public void removeVehicle(String registrationNumber);
}
