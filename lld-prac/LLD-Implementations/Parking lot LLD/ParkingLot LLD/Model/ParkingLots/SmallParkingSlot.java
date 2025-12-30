package org.example.Model.ParkingLots;

import org.example.Model.ParkingSlot;
import org.example.Model.Vehicle;

public class SmallParkingSlot extends ParkingSlot {

    public SmallParkingSlot(int slotnum) {
        super(slotnum,"small");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "small".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
