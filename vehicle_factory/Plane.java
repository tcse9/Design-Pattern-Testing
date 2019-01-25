package com.taufiq.androidvideoplayer.utils;

public class Plane implements Vehicle {

    public int wheels = 6;
    public int passengers = 120;
    public boolean hasGas = true;

    @Override
    public int set_num_of_wheels() {
        return this.wheels;
    }

    @Override
    public int set_num_of_passngers() {
        return this.passengers;
    }

    @Override
    public boolean has_gas() {
        return this.hasGas;
    }



    @Override
    public String toString() {
        return "This Plane has "+this.wheels+" wheels with "+this.passengers+" passengers and gas status "+this.hasGas;
    }
}
