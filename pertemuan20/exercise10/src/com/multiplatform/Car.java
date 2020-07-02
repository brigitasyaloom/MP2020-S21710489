package com.multiplatform;
class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    Car() {}

    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        System.out.println("Car machine turn on");
    }

    public void accelerate() {
        System.out.println("Car Accelerated");
    }

    public void brake() {
        System.out.println("Car braked");
    }
}