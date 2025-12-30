package org.example.Model.ParkingLots;

import org.example.Model.ParkingSlot;
import org.example.Model.Vehicle;

public class LargeParkingSlot extends ParkingSlot {

    public LargeParkingSlot(int slotnum) {
        super(slotnum,"large");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "large".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
