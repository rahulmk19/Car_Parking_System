package com.parking;

public class VehicleSpace {

	private int spaceNumber;
	private boolean available;
	private VehicleType vehicleType;
	private Vehicle vehicle;

	public VehicleSpace(int spaceNumber, VehicleType vehicleType) {
		this.spaceNumber = spaceNumber;
		this.vehicleType = vehicleType;
		this.available = true;
	}

	public boolean isAvailable() {
		return available;
	}

	public void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.available = false;
	}

	public void removeVehicle() {
		this.vehicle = null;
		this.available = true;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	
	

}
