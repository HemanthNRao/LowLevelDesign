package StrategyPattern;

public class SpecialVehicle implements VehicleStrategy
{
    public void drive()
    {
        System.out.println("Special vehicle context");
    }
}
