package org.example.Model;

import java.util.List;

public class ParkingLot {
    private List<ParkingSlot> parkingSlots;

    public ParkingLot(List<ParkingSlot> slots) {
        this.parkingSlots = slots;
    }

    public ParkingSlot findAvailableSlot(String vehicleType) {
        for (ParkingSlot slot : parkingSlots) {
            if(!slot.isOccupied() && slot.getSlotType().equalsIgnoreCase(vehicleType)) {
                return slot;
            }
        }
        return null;
    }

    public ParkingSlot parkVehicle(Vehicle vehicle) {
        ParkingSlot availableSlot = findAvailableSlot(vehicle.getVehicleType());
        if(availableSlot != null) {
            availableSlot.parkVehicle(vehicle);
            return availableSlot;
        }

        throw new IllegalArgumentException("No available slot for the current vehicle");
    }

    public void vacateSlot(ParkingSlot slot,Vehicle vehicle) {
        if(slot != null && slot.isOccupied() && slot.getVehicle().equals(vehicle)) {
            slot.vacate();
            return;
        }
        throw new IllegalArgumentException("Either the slot is already vacant or vehicle mismatched");
    }

    public ParkingSlot getBySlotNumber(int slotNumber) {
        for (ParkingSlot slot : parkingSlots) {
            if(slot.getSlotNumber() == slotNumber) {
                return slot;
            }
        }
        throw new IllegalArgumentException("Slot not found");
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }
}
