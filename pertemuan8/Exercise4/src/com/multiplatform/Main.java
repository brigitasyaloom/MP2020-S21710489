package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0,4.0));
        System.out.println(area(-1.0,4.0));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static int area(double x,double y){
        if((x < 0) || (y < 0)){
            return (int) -1.0;
        }
        return (int) x * (int)y;
    }
}
