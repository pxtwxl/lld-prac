package org.behavioural.stateDesign;

public interface TrafficLightState {
    public void next(TrafficLightContext context);
    public String getColor();
}

class YellowState implements TrafficLightState {

    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from YELLOW to GREEN.Cars GO !!");
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}

class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from RED to YELLOW.Cars WAIT !!");
        context.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}

class GreenState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Switching from GREEN to RED.Cars STOP !!");
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
