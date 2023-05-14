package StrategyPattern;

public class NormalVehicle implements VehicleStrategy
{
    public void drive()
    {
        System.out.println("Normal vehicle context");
    }
}
