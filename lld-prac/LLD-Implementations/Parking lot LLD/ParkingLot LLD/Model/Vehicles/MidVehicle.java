package org.example.Model.Vehicles;

import org.example.Model.ParkingFeeStrategy;
import org.example.Model.Vehicle;

public class MidVehicle extends Vehicle {

    public MidVehicle(String licensePlate, ParkingFeeStrategy feeStrategy) {
        super("mid",licensePlate,feeStrategy);
    }
}
