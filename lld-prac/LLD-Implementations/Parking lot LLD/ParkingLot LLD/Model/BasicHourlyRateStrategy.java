package org.example.Model;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy{

    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        switch (vehicleType.toLowerCase()) {
            case "mid" :
                return durationType == DurationType.HOURS ? duration * 10.0 : duration * 10.0 * 24;

            case "small" :
                return durationType == DurationType.HOURS ? duration * 5.0 : duration * 5.0 * 24;

            case "large" :
                return durationType == DurationType.HOURS ? duration * 20.0 : duration * 20.0 * 24;

            default:
                return durationType == DurationType.HOURS ? duration * 10.0 : duration * 10.0 * 24;
        }
    }
}
