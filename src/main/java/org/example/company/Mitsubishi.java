package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        printSimpleName();
        return (getClass().getSimpleName() + "the car's engine is starting");
    }

    @Override
    public String accelerate(){
        printSimpleName();
        return (getClass().getSimpleName() +"the car is accelerating") ;
    }

    @Override
    public String brake(){
        printSimpleName();
        return (getClass().getSimpleName() +"the car is braking") ;
    }
}
