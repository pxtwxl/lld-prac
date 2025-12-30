package org.example.Model.Vehicles;

import org.example.Model.ParkingFeeStrategy;
import org.example.Model.Vehicle;

public class SmallVehicle extends Vehicle {

    public SmallVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super("small",licensePlate,feeStrategy);
    }
}
