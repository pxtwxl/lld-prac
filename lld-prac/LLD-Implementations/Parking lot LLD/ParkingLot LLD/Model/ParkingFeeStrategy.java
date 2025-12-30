package org.example.Model;

public interface ParkingFeeStrategy {
    double calculateFee(String vehicleType,int duration,DurationType durationType);
}
