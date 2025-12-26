package org.creational.factory;

public interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting the car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting the bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike");
    }
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting the truck");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck");
    }
}