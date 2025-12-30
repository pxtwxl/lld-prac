package org.example.Model;

public abstract class Vehicle {
    private String vehicleType;
    private String licensePlate;
    private ParkingFeeStrategy feeStrategy;

    public Vehicle(String vehicleType1,String licensePlate1,ParkingFeeStrategy feeStrategy1) {
        this.vehicleType = vehicleType1;
        this.licensePlate = licensePlate1;
        this.feeStrategy = feeStrategy1;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double calculateFee(int duration,DurationType durationType) {
        return feeStrategy.calculateFee(vehicleType,duration,durationType);
    }
}
