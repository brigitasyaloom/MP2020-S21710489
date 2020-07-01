package com.multiplatform;

public class Account {
    public String accountNumber;
    public String name;
    public double balance;

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double amount){
        if(balance - amount < 0){
            System.out.println("Not enough balanced");
        } else {
            balance -= amount;
            System.out.println("Withdrawal completed");
        }

    }


}
