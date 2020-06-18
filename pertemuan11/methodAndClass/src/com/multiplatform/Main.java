package com.multiplatform;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        car toyota = new car();
//        toyota.setModel("Agya");
//        System.out.println("Model is " + toyota.getModel());
//
//        car daihatsu = new car();
//        toyota.setModel("Xenia");
//        System.out.println("Model is " + toyota.getModel());
//
//        car mitsubishi = new car();
//        toyota.setModel("Pajero");
//        System.out.println("Model is " + toyota.getModel());

            simpleCalculator calculator = new simpleCalculator();
            calculator.setFirstNumber(5.0);
            calculator.setSecondNumber(4);
            System.out.println("add "+ calculator.getAdditionResult());
            System.out.println("sub " + calculator.getSubstractionResult());
            calculator.setFirstNumber(5.25);
            calculator.setSecondNumber(0);
            System.out.println("mul "+ calculator.getMultiplicationResult());
            System.out.println("div " + calculator.getDivisionResult());
        }
   }
