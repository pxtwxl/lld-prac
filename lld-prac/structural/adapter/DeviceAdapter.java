package org.structural.adapter;

public class DeviceAdapter {
    public static void main(String[] args) {
        SmartDevice refrigeratorAdapter = new RefrigeratorAdapter(new Refrigerator());
        SmartDevice airConditionerAdapter = new AirConditionerAdapter(new AirConditioner());

        refrigeratorAdapter.switchOn();
        refrigeratorAdapter.switchOff();
        airConditionerAdapter.switchOn();
        airConditionerAdapter.switchOff();
    }
}
