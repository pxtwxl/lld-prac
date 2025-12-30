package org.example.Model.ParkingLots;

import org.example.Model.ParkingSlot;
import org.example.Model.Vehicle;

public class MidParkingSlot extends ParkingSlot {

    public MidParkingSlot(int slotnum) {
        super(slotnum,"mid");
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "mid".equalsIgnoreCase(vehicle.getVehicleType());
    }
}
