package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	person person = new person();
	person.setFirstName("");
	person.setLastName("");
	person.setAge(10);
	System.out.println("Full Name = " + person.getFullName());
	System.out.println("Teen = " + person.isTeen());
	person.setFirstName("John ");
	person.setAge(18);
	System.out.println("Full Name = " + person.getFullName());
	System.out.println("Teen = " + person.isTeen());
	person.setLastName("Smith");
	System.out.println("Full Name = " + person.getFirstName() + person.getLastName());
    }
}
