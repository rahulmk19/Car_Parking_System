package com.parking;

public class Vehicle {

	private String registrationNum;
	private String color;
	private VehicleType vehicleType;

	public Vehicle() {
		super();
	}

	public Vehicle(String registrationNum, String color, VehicleType vehicleType) {
		super();
		this.registrationNum = registrationNum;
		this.color = color;
		this.vehicleType = vehicleType;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [RegistrationNum :" + registrationNum + ", Color :" + color + ", VehicleType :" + vehicleType
				+ "]";
	}

}
