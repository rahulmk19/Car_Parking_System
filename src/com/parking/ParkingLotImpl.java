package com.parking;

public class ParkingLotImpl implements ParkingLot {

	private int totalFloors;
	private FloorImpl[] floors;

	public ParkingLotImpl(int totalFloors, int capacityPerFloor) {
		this.totalFloors = totalFloors;
		this.floors = new FloorImpl[totalFloors];
		for (int i = 0; i < totalFloors; i++) {
			this.floors[i] = new FloorImpl(i + 1, capacityPerFloor);
		}
	}

	public boolean checkAvailability(int floorNumber, VehicleType type) {
		if (floorNumber > 0 && floorNumber <= totalFloors) {
			return floors[floorNumber - 1].isSpaceAvailable(type);
		}
		return false;
	}

	public String addVehicle(int floorNumber, Vehicle vehicle) {
		if (floorNumber > 0 && floorNumber <= totalFloors) {
			VehicleSpace space = floors[floorNumber - 1].parkVehicle(vehicle);
			if (space != null) {
				return "Vehicle parked in space " + space.getVehicle().getRegistrationNum();
			}
			return "No Available space for this vehicle type on floor " + floorNumber;
		}
		return "Invalid floor number : " + floorNumber;
	}

	public void removeVehicle(String registrationNumber) {
		for (FloorImpl floor : floors) {
			floor.removeVehicle(registrationNumber);
		}
	}

}
