package com.taufiq.androidvideoplayer.utils;

public class Car implements Vehicle {

    public int wheels = 4;
    public int passengers = 4;
    public boolean hasGas = false;


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
        return "This Car has "+this.wheels+" wheels with "+this.passengers+" passengers and gas status "+this.hasGas;
    }
}
