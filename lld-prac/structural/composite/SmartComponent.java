package org.structural.composite;

import java.util.ArrayList;
import java.util.List;

public interface SmartComponent {
    void switchOn();
    void switchOff();
}

class SmartAC implements SmartComponent {

    @Override
    public void switchOn() {
        System.out.println("Switching on the AC");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the AC");
    }
}

class SmartLight implements SmartComponent {

    @Override
    public void switchOn() {
        System.out.println("Switching on the Lights");
    }

    @Override
    public void switchOff() {
        System.out.println("Switching off the Lights");
    }
}

class CompositeSmartComponents implements SmartComponent {
    List<SmartComponent> components = new ArrayList<>();

    CompositeSmartComponents(List<SmartComponent> components) {
        this.components = components;
    }

    public void addComponent(SmartComponent component) {
        components.add(component);
    }

    public void removeComponent(SmartComponent component) {
        components.remove(component);
    }

    @Override
    public void switchOn() {
        for(SmartComponent component : components) {
            component.switchOn();
        }
    }

    @Override
    public void switchOff() {
        for(SmartComponent component : components) {
            component.switchOff();
        }
    }
}
