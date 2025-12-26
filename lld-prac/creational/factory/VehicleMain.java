package org.creational.factory;

// This is an example of Factory Method Pattern
// Handling the object creation in a centralized manner
// instead of wasting the resources on all object creation and duplication of processes

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new VehicleFactory().getVehicle("Bike");
        car.start();
        car.stop();
    }
}
