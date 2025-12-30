package org.example.Model;

import org.example.Model.Vehicles.LargeVehicle;
import org.example.Model.Vehicles.MidVehicle;
import org.example.Model.Vehicles.SmallVehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType,String licensePlate,ParkingFeeStrategy feeStrategy) {
        if(vehicleType.equalsIgnoreCase("small")) {
            return new SmallVehicle(licensePlate, feeStrategy);
        } else if(vehicleType.equalsIgnoreCase("mid")) {
            return new MidVehicle(licensePlate, feeStrategy);
        } else if(vehicleType.equalsIgnoreCase("large")) {
            return new LargeVehicle(licensePlate, feeStrategy);
        } else {
            throw new IllegalArgumentException("Unexpected vehicle type");
        }
    }
}
