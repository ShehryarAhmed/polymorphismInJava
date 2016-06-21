package com.company;

/**
 * Created by apple on 22-Jun-16.
 */
public class Car extends vehicle {
    public Car(String color, int model,String brand){
        super(color,model,brand);
    }

    @Override
    public void repair() {
        System.out.println("Car Repaired..");
    }
}
