package com.multiplatform;

public class Dog {
   private int eyes;
    private int legs;
    private int tail;

    public Dog(int eyes, int legs, int tail) {
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
    }

    private void walk(int speed){
        System.out.println(getName() + " is running with speed" + speed ;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }
}
}
