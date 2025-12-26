package org.behavioural.stateDesign;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void next() {
        this.currentState.next(this);
    }

    public String getColor() {
        return this.currentState.getColor();
    }
}
