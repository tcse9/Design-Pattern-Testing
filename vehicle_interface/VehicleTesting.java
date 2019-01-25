package com.taufiq.androidvideoplayer.utils;


public class VehicleTesting {

    public static void main(String[] args){

        Vehicle car = new Car();
        ((Car) car).wheels = 4;
        ((Car) car).passengers = 6;
        ((Car) car).hasGas = true;
        System.out.println(car.toString());


        Vehicle plane = new Plane();
        System.out.println(plane.toString());
    }
}
