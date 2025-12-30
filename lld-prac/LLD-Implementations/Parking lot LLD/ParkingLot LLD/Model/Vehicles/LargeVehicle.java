package org.example.Model.Vehicles;

import org.example.Model.ParkingFeeStrategy;
import org.example.Model.Vehicle;

public class LargeVehicle extends Vehicle {

    public LargeVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super("large",licensePlate,feeStrategy);
    }
}
