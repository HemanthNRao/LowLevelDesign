package NullObjectPattern;

public class VehicleFactory
{
    public AbstractVehicle getVehicle(String vehicle)
    {
        if(vehicle.equals("CAR"))
            return new RealVehicle();
        return new NullObject();
    }
}
