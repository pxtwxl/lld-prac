package org.behavioural.template;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.prepareVehicle();
        bike.prepareVehicle();
    }
}
