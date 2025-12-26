package org.structural.adapter;

public interface SmartDevice {
    void switchOn();
    void switchOff();
}

class AirConditioner {

    public void Cooling(){
        System.out.println("Cooling the room");
    }

    public void lowFan() {
        System.out.println("Running fan on low");
    }

    public void MidFan() {
        System.out.println("RUnning fan on mid");
    }

    public void HighFan() {
        System.out.println("Running fan on high");
    }

    public void initiatePowerOff() {
        System.out.println("Powering off the AC");
    }
}

class Refrigerator {

    public void FreezerOn() {
        System.out.println("Starting the Freezer");
    }

    public void lowCool() {
        System.out.println("Cooling on low intensity");
    }

    public void highCool() {
        System.out.println("COoling on high intensity");
    }

    public void initiatePowerOff() {
        System.out.println("Initiating Power Off");
    }
}