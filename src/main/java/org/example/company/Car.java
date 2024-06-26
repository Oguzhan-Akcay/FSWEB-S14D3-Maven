package org.example.company;

public class Car {
    private boolean engine;
    private  int cylinders;
    private String name;
    private  int wheels;

    public Car(int cylinders, String name) {
        this.engine = Boolean.TRUE;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        return cylinders == other.cylinders && name.equals(other.name);
    }

    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate(){
        printSimpleName();
        return "the car is accelerating" ;
    }

    public String brake(){
        printSimpleName();
        return "the car is braking" ;
    }

    public void printSimpleName(){
        System.out.println("Class name: " + getClass().getSimpleName());
    }
}
