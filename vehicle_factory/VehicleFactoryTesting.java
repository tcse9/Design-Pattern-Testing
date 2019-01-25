package com.taufiq.androidvideoplayer.utils;

public class VehicleFactoryTesting {

    public static void main(String[] args){
        VehicleFactory shapeFactory = new VehicleFactory();


        Vehicle car = shapeFactory.getVehicle("CAR");
        Vehicle plane = shapeFactory.getVehicle("PLANE");

        System.out.println(car.toString());
        System.out.println(plane.toString());
    }
}
