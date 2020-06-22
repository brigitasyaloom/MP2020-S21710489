package com.multiplatform;

import java.awt.image.PackedColorModel;

public class Account {
    private String number;
    private double balance;
    private String CustomerName;
    private String emailAddress;
    private String phoneNUmber;

    public Account(){
        //System.out.println("Custructor without parameter is running");
        this("9999999", 0.0, "default")
    }

    public Account (String number,double balance, String customerName, String emailAddress, String phoneNUmber){
        this.number = number;
        this.balance = balance;
        this.CustomerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNUmber = phoneNUmber;
    }
    public Account(String CustomerName, String emailAddress, String phoneNumber){
        this.CustomerName =CustomerName;
        this.emailAddress =emailAddress;
        this.phoneNUmber=phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void deposit (double amount){
        this.balance += amount;

    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public String getPhoneNUmber() {
        return phoneNUmber;
    }


}
