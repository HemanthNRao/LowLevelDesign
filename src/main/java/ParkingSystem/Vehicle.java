package ParkingSystem;

public class Vehicle
{
    VehicleType vehicleType;
    String id;

    public Vehicle(VehicleType vehicleType, String id)
    {
        this.vehicleType = vehicleType;
        this.id = id;
    }

    public VehicleType getVehicleType()
    {
        return vehicleType;
    }

    public String getId()
    {
        return id;
    }
}
