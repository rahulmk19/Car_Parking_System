package com.parking;

public class FlatCost implements CostStrategy {

	private double costPerHour;

	public FlatCost(double costPerHour) {
		this.costPerHour = costPerHour;
	}

	@Override
	public double calculateCost(double duration) {
		return costPerHour * duration;
	}
}
