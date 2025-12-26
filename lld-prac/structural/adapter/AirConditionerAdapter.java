package org.structural.adapter;

public class AirConditionerAdapter implements SmartDevice{
    private AirConditioner airConditioner;

    AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void switchOn() {
        airConditioner.Cooling();
        airConditioner.lowFan();
    }

    @Override
    public void switchOff() {
        airConditioner.initiatePowerOff();
    }
}

class RefrigeratorAdapter implements SmartDevice {
    private Refrigerator refrigerator;

    RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void switchOn() {
        refrigerator.FreezerOn();
        refrigerator.lowCool();
    }

    @Override
    public void switchOff() {
        refrigerator.initiatePowerOff();
    }
}
