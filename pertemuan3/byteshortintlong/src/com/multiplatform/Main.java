package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	int integervalue = 20000;
	byte bytevalue = 100;
	short shortvalue = 2000;
	long longvalue = 100000;

	int mymaxintvalue = Integer.MAX_VALUE;
	int myminintvalue = Integer.MIN_VALUE;
	System.out.println("Integer Maximum Value = " + mymaxintvalue);
	System.out.println("Integer Minimum Value = " + myminintvalue);
	System.out.println("Overflow Maximum Value = " + (mymaxintvalue + 1));
	System.out.println("Underflow Minimum Value = " + (myminintvalue - 1));


	//Assignment 2 (Byte, Short, Long)

		byte maxByteValue = Byte.MAX_VALUE;
		byte minByteValue = Byte.MIN_VALUE;
		System.out.println("Byte Maximum value = " + maxByteValue);
		System.out.println("Byte Minimum value = " + minByteValue);

		short maxShortValue = Short.MAX_VALUE;
		short minShortValue = Short.MIN_VALUE;
		System.out.println("Short Maximum value = " + maxShortValue);
		System.out.println("Short Minimum value = " + minShortValue);

		long maxLongValue = Long.MAX_VALUE;
		long minLongValue = Long.MIN_VALUE;
		System.out.println("Long Maximum value = " + maxLongValue);
		System.out.println("Long Minimum value = " + minLongValue);





    }
}
