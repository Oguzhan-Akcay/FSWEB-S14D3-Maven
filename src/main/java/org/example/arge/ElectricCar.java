package org.example.arge;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private int batterySize;


    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;

    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of Electric Car");
        runEngine();
    }

    @Override
    public void drive() {
        System.out.println("Driving Electric Car");
        runEngine();
    }
}
