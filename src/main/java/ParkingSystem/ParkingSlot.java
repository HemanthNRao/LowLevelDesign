package ParkingSystem;

public class ParkingSlot
{
    String id;
    Vehicle vehicle;
    boolean isEmpty;
    float price;

    void parkVehicle(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    void removeVehicle()
    {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public boolean isEmpty()
    {
        return isEmpty;
    }
}
