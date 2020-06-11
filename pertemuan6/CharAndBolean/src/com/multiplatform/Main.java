package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	char mychar = 'D';
	char myUnicodeChar = '\u0044';
	System.out.println(mychar);
	System.out.println(myUnicodeChar);
	char myOtherUnicodeChar = '\u00A9' ;
	System.out.println(myOtherUnicodeChar);

	boolean myFirstBoolean = true;
	boolean mySecondBolean = false;
	boolean isLoggedIn = true;

	String myString = "This is a String";
        System.out.println("My String" + myString );
        myString = myString + ". this is more";
        System.out.println("My String : " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("My String :" + myString);

        String myNumberString = "50.25";
        System.out.println("40.75" + myNumberString);
        int myInt = 10;
        myNumberString = myNumberString + myInt;
        System.out.println(myNumberString);

    }
}
