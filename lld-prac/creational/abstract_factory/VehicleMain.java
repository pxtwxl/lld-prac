package org.creational.abstract_factory;

// This is an example of Abstract Factory Method Pattern
// Handling the object creation of related objects without exposing concrete classes directly
// instead of changing the object creation core structure , just add another level of factory class
// which handles object creation through the new factory of the required new object type

public class VehicleMain {
    public static void main(String[] args) {
        String vehicleType = "Bike";
        Vehicle vehicle;

        if(vehicleType.equals("Car")) {
            vehicle = new CarFactory().createVehicle();
        } else if (vehicleType.equals("Bike")) {
            vehicle = new BikeFactory().createVehicle();
        } else if (vehicleType.equals("Truck")) {
            vehicle = new TruckFactory().createVehicle();
        } else {
            System.out.println("Wrong vehicle type");
            return;
        }

        vehicle.start();
        vehicle.stop();
    }
}
