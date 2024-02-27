# Car Parking System

This project is a Java implementation of a car parking system that can accommodate different types of vehicles and supports a configurable cost strategy.

## Features

1. **Initialization:** Initialize the parking lot with a given number of floors and car spaces per floor for each vehicle type.
2. **Add Vehicle:** Add vehicle details to the parking lot, including the vehicle type, registration number, and color.
3. **Remove Vehicle:** Remove a vehicle from the parking lot based on the registration number.
4. **Check Availability:** Check the availability of vehicle spaces on a specific floor for a given vehicle type.

## Classes

1. **ParkingLot:** Represents the parking lot and manages vehicle spaces.
2. **Vehicle:** Represents a vehicle with attributes such as vehicle type, registration number, and color.
3. **Floor:** Represents a floor in the parking lot with attributes like floor number and vehicle spaces.
4. **ParkingSpace:** Represents a vehicle space with attributes such as space number, availability, and vehicle type.
5. **CostStrategy:** Represents the cost strategy for parking, allowing for varying costs based on the vehicle type.

## Usage

To use the car parking system, follow these steps:

1. **Initialization:** Initialize the parking lot by providing the total number of floors and vehicle spaces per floor for each vehicle type.
2. **Add Vehicle:** Add vehicles to the parking lot using the `addVehicle` method.
3. **Remove Vehicle:** Remove vehicles from the parking lot using the `removeVehicle` method.
4. **Check Availability:** Check the availability of vehicle spaces on a specific floor for a given vehicle type using the `checkAvailability` method.

## Example

```java
public class Main {
    public static void main(String[] args) {
        // Initialize parking lot
        ParkingLot parkingLot = new ParkingLot(5, 5); // 5 floors, 5 spaces per floor

        // Add vehicles
        Vehicle bus1 = new Vehicle("Bus001", "Yellow", VehicleType.Bus);

        Vehicle car1 = new Vehicle("Car001", "White", VehicleType.Car);
		    Vehicle car2 = new Vehicle("Car002", "Green", VehicleType.Car);

        Vehicle sports1 = new Vehicle("Sports001", "Yellow", VehicleType.Sports);
		    Vehicle sports2 = new Vehicle("Sports002", "Red", VehicleType.Sports);
		    Vehicle sports3 = new Vehicle("Sports003", "Blue", VehicleType.Sports);
        
        // Remove vehicle by registration number
        parkingLot.removeVehicle("CAR123");

        // Check availability
        System.out.println(parkingLot.addVehicle(1, car1));
    		System.out.println(parkingLot.addVehicle(1, car2));
    		System.out.println(parkingLot.addVehicle(2, bus1));
    		System.out.println(parkingLot.addVehicle(8, sports2));
    		System.out.println(parkingLot.addVehicle(3, sports1));
    		System.out.println(parkingLot.addVehicle(5, sports3));
    }
}
```
## Message
Special thanks to you for visiting my project, feel free to personalize the message according to your preferences!
