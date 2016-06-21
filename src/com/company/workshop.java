package com.company;

/**
 * Created by apple on 22-Jun-16.
 */
public class workshop {
    public String name;
    public workshop(String n){
        this.name = n;
    }
    public void dorepair(vehicle v){v.repair();}
}
