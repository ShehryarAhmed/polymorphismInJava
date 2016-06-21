package com.company;

/**
 * Created by apple on 22-Jun-16.
 */
public class bus extends vehicle {
    public bus(String color, int model, String brand){
        super(color,model,brand);
            }

    @Override
    public void repair() {
        System.out.println("Bus Repaired..");
    }
}
