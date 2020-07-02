package com.multiplatform;


public class Honda extends Car{
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Honda car brakes");
    }

}

