package org.example.Model;

public class PremiumRateStrategy implements ParkingFeeStrategy{

    @Override
    public double calculateFee(String vehicleType, int duration, DurationType durationType) {
        switch (vehicleType.toLowerCase()) {
            case "mid" :
                return durationType == DurationType.HOURS ? duration * 16.0 : duration * 16.0 * 24;

            case "small" :
                return durationType == DurationType.HOURS ? duration * 12.0 : duration * 12.0 * 24;

            case "large" :
                return durationType == DurationType.HOURS ? duration * 24.0 : duration * 24.0 * 24;

            default:
                return durationType == DurationType.HOURS ? duration * 16.0 : duration * 16.0 * 24;
        }
    }
}
