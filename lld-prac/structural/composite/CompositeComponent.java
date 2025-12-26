package org.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeComponent {
    public static void main(String[] args) {
        SmartComponent ac = new SmartAC();
        SmartComponent light = new SmartLight();
        List<SmartComponent> components = new ArrayList<>();
        components.add(ac);
        components.add(light);

        CompositeSmartComponents smartComponents = new CompositeSmartComponents(components);

        smartComponents.switchOn();
        smartComponents.switchOff();
    }
}
