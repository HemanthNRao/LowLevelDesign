package StrategyPattern;

public class VehicleContext
{
    VehicleStrategy normalVehicle;
    VehicleContext(VehicleStrategy normalVehicle)
    {
        this.normalVehicle = normalVehicle;
    }

    public void drive()
    {
        normalVehicle.drive();
    }
}
