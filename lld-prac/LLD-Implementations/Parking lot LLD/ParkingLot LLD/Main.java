package org.example;

import org.example.Model.*;
import org.example.Model.ParkingLots.LargeParkingSlot;
import org.example.Model.ParkingLots.MidParkingSlot;
import org.example.Model.ParkingLots.SmallParkingSlot;
import org.example.Model.Vehicles.MidVehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(new LargeParkingSlot(1));
        parkingSlots.add(new LargeParkingSlot(2));
        parkingSlots.add(new MidParkingSlot(3));
        parkingSlots.add(new MidParkingSlot(4));
        parkingSlots.add(new SmallParkingSlot(5));
        parkingSlots.add(new SmallParkingSlot(6));

        ParkingLot lot = new ParkingLot(parkingSlots);

        ParkingFeeStrategy basicHourly = new BasicHourlyRateStrategy();
        ParkingFeeStrategy premium = new PremiumRateStrategy();

        Vehicle car1 = VehicleFactory.createVehicle("mid","BH3445",basicHourly);
        Vehicle car2 = VehicleFactory.createVehicle("mid","BH0100",premium);
        Vehicle bike = VehicleFactory.createVehicle("small","BH1233",basicHourly);
        Vehicle truck = VehicleFactory.createVehicle("large","BH9012",basicHourly);

        ParkingSlot car2Slot = lot.parkVehicle(car2);
        ParkingSlot truckSlot = lot.parkVehicle(truck);
        ParkingSlot bikeSlot = lot.parkVehicle(bike);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the payment option 1. Cash 2. Online  : ");
        int paymentMode = scanner.nextInt();

        if(car2Slot != null) {
            double vehicleFare = car2.calculateFee(5,DurationType.HOURS);
            PaymentStrategy strategy = getPaymentStrategy(paymentMode);

            strategy.processPayment(vehicleFare);
            lot.vacateSlot(car2Slot,car2);
        }


        if(truckSlot != null) {
            double vehicleFare = car2.calculateFee(10,DurationType.HOURS);
            PaymentStrategy strategy = getPaymentStrategy(paymentMode);

            strategy.processPayment(vehicleFare);
            lot.vacateSlot(truckSlot,truck);
        }
    }

    private static PaymentStrategy getPaymentStrategy(int payMode) {
        switch (payMode) {
            case 1 :
                return new CashPaymentStrategy();
            case 2 :
                return new OnlinePaymentStrategy();
            default:
                throw new IllegalArgumentException("Unknown payment mode ,retry");
        }
    }
}