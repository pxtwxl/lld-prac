package org.behavioural.stateDesign;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLightContext light = new TrafficLightContext();
        light.next();
        light.next();
        light.next();
        light.next();
    }
}
