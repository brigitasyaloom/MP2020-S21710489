package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	int myvalue = 10000;
	int mymaxintvalue = Integer.MAX_VALUE;
	int myminintvalue = Integer.MIN_VALUE;
	System.out.println("Integer Maximum Value = " + mymaxintvalue);
	System.out.println("Integer Minimum Value = " + myminintvalue);
	System.out.println("Overflow Max Value = " + (mymaxintvalue + 1));
	System.out.println("Underflow Min Value = " + (myminintvalue - 1));

	int mymaxinttest = 2_147_483_647;
	
    }
}
