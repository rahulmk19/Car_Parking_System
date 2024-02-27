package com.parking;

import java.util.HashMap;
import java.util.Map;

public class FloorImpl implements Floor {

	private int floorNumber;
	private Map<VehicleType, VehicleSpace[]> spaces;

	public FloorImpl(int floorNumber, int capacityPerType) {
		this.floorNumber = floorNumber;
		spaces = new HashMap<>();
		for (VehicleType type : VehicleType.values()) {
			spaces.put(type, new VehicleSpace[capacityPerType]);
			for (int i = 0; i < capacityPerType; i++) {
				spaces.get(type)[i] = new VehicleSpace(i + 1, type);
			}
		}

	}

	public boolean isSpaceAvailable(VehicleType type) {
		for (VehicleSpace space : spaces.get(type)) {
			if (space.isAvailable()) {
				return true;
			}
		}
		return false;
	}

	public VehicleSpace parkVehicle(Vehicle vehicle) {
		for (VehicleSpace space : spaces.get(vehicle.getVehicleType())) {
			if (space.isAvailable()) {
				space.parkVehicle(vehicle);
				return space;
			}
		}
		return null;
	}

	public void removeVehicle(String registrationNumber) {
		for (VehicleSpace[] spaceArray : spaces.values()) {
			for (VehicleSpace space : spaceArray) {
				if (!space.isAvailable() && space.getVehicle().getRegistrationNum().equals(registrationNumber)) {
					space.removeVehicle();
					return;
				}
			}
		}
	}
}
