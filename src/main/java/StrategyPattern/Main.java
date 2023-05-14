package StrategyPattern;

public class Main
{
    public static void main(String[] args)
    {
        // Normal vehicle context
        VehicleContext normalVehicleContext = new VehicleContext(new NormalVehicle());
        normalVehicleContext.drive();

        // Special vehicle context
        VehicleContext specialVehicleContext = new VehicleContext(new SpecialVehicle());
        specialVehicleContext.drive();
    }
}
