package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        toMilesPerHour(25.42);
        System.out.println("valid value : "+ toMilesPerHour(25.42));
        printConversion(25.42);
    }
    public  static  long toMilesPerHour (Double kilometerPerHour){
        if (kilometerPerHour < 0 ){
            return -1;
        }
        return Math.round( kilometerPerHour / 1.609);
    }

    public  static void printConversion (double kilometerPerHour){
        if(kilometerPerHour < 0){
            System.out.println("Invalid Value ");
        }
        long milesPerHours = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + " km/h = " + milesPerHours + "mi/h");
    }
}
