package com.company;

/**
 * Created by apple on 22-Jun-16.
 */
public class vehicle {
    private String color;
    private int model;
    private String brand;
    public vehicle(String color, int model, String brand){
        this.color = color;
        this.brand = brand;
        this.model = model;
    }
    public void repair(){
        System.out.println("Vehicle Repair..");
    }
}
