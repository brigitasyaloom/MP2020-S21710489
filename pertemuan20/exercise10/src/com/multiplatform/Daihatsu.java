package com.multiplatform;

public class Daihatsu extends Car{
    public Daihatsu(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Daihatsu car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Daihatsu car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Daihatsu car brakes");
    }

}

