package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        Fish mujair = new Fish("Mujair", 10,2,2);
        mujair.eat();
        mujair.sleep();
        mujair.move();

        Dog husky = new Dog();
        husky.eat();
        husky.sleep();
        husky.move(6);
        husky.move(6);
    }
}
