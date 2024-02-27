package com.parking;

public interface Floor {

	public boolean isSpaceAvailable(VehicleType type);

	public VehicleSpace parkVehicle(Vehicle vehicle);

	public void removeVehicle(String registrationNumber);
}
