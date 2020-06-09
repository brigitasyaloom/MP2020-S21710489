package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        byte bytevalue = 30;
        short shortvalue = 500;
        int intvalue = 1000;

        long longValue = (50000 + 10L ) * (bytevalue + shortvalue + intvalue);
        System.out.println("longValue  = " + longValue);
    }
}
