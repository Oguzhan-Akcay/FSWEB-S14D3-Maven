package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting engine of " + name);
        runEngine();
    }

    public void drive() {
        System.out.println("Driving " + name);
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Running engine of " + name);
    }
}
