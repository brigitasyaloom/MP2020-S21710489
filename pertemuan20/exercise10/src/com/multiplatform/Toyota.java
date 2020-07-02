package com.multiplatform;


public class Toyota extends Car{
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota car engine turns on");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota car Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Toyota car brakes");
    }

}

