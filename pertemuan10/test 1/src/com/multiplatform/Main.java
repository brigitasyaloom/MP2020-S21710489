package com.multiplatform;

public class Main {

    public static void main(String[] args) {
//	 write your code here
        //1
        printMegabytesAndKilobytes(2500);
        printMegabytesAndKilobytes(-1024);
        printMegabytesAndKilobytes(5000);
        //2
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1, -1,-1);
        printEqual(1,2,3);

    }
    public static void printMegabytesAndKilobytes(int kiloBytes){
        int megabytes = kiloBytes / 1024;
        int remKilobytes = kiloBytes % 1024;

        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        System.out.println(kiloBytes + " KB = " + megabytes + " MB = " + remKilobytes + " KB");
    }

    public static void printEqual(int a, int b,int c){
        if ((a<0) || (b<0) || (c <0)){
            System.out.println("Invalid value");
        }
        else if((a==b) && (a==c)){
            System.out.println("All numbers are equal");
        }
        else if ( (a!=b) && (a != c) && (b != c) ){
            System.out.println("All numbers are different");
        }
        System.out.println("Neither all are equal or different");
    }



}
