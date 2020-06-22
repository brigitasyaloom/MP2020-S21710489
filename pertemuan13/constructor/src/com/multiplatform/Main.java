package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	Account bobsAccount = new Account();
//	bobsAccount.setCustomerName("Bob");
//	bobsAccount.setNumber("123456789");
//	bobsAccount.setNumber("100.00");
//	bobsAccount.setEmailAddress("bob@mail.com");
//	bobsAccount.setPhoneNUmber("(62)0811324234");

        System.out.println("Customer name : " +bobsAccount.getCustomerName());
        System.out.println("Balance : "+ bobsAccount.getBalance());
        bobsAccount.deposit(50.0);
        System.out.println("Balance : " + bobsAccount.getBalance());

    }
}
