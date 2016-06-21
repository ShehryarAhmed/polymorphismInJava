package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        workshop ws = new workshop("Shehryar");
        vehicle v[] = new vehicle[5];
        Car c = new Car("mahroon",2016,"Swift");
        Sportcar sc = new Sportcar("red",2010,"ferrari");
        bus b = new bus("w11",1990,"toyota ");
        v[0] = c;
        v[1] = sc;
        v[2] = b;
        ws.dorepair(v[0]);
        ws.dorepair(v[1]);
        ws.dorepair(v[2]);

    }
}
