package org.behavioural.template;

public abstract class Vehicle {
    final void prepareVehicle() {
        buildFrame();
        addWheels();
        paintJob();
        addEngine();
    }

    void buildFrame() {
        System.out.println("Building frame for the vehicle");
    }

    void paintJob() {
        System.out.println("Paint Job on the vehicle");
    }

    abstract void addWheels();
    abstract void addEngine();
}

class Car extends Vehicle {
    @Override
    void addWheels() {
        System.out.println("Adding 4 wheels to the Car");
    }

    @Override
    void addEngine() {
        System.out.println("Adding Car Engine");
    }
}

class Bike extends Vehicle {
    @Override
    void addWheels() {
        System.out.println("Adding 2 wheels to the Bike");
    }

    @Override
    void addEngine() {
        System.out.println("Adding Bike Engine");
    }
}
