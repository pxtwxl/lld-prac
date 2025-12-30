package org.example.Model;

public abstract class ParkingSlot {
    private int slotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;
    private String slotType;

    public ParkingSlot(int slotNumber,String slotType) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.slotType = slotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSlotType() {
        return slotType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    void parkVehicle(Vehicle vehicle) {
        if(isOccupied) {
            throw new IllegalArgumentException("Slot is already occupied");
        }

        if(!canParkVehicle(vehicle)) {
            throw new IllegalArgumentException("SLot is not suitable for the vehicle type");
        }

        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate() {
        if(!isOccupied) {
            throw new IllegalArgumentException("Slot is already vacant");
        }

        this.vehicle = null;
        this.isOccupied = false;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
}
