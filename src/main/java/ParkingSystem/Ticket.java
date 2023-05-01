package ParkingSystem;

import java.time.LocalDateTime;

public class Ticket
{
    public Ticket(String id, Vehicle vehicle, ParkingSlot parkingSlot, LocalDateTime entryTime)
    {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
    }

    String id;
    Vehicle vehicle;
    ParkingSlot parkingSlot;
    LocalDateTime entryTime;
}
