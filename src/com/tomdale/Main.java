package com.tomdale;

public class Main {

    public static void main(String[] args) {
        byte newByte = 50;
        short newShort = 4567;
        int newInt = 78_465;

        long longTotal = 50_000L + 10L * (newByte + newShort +newInt);
        short shortTotal = (short) (1000 + 10 * (newByte + newShort + newInt));
        System.out.println("Long Total = " + longTotal);
        System.out.println("Short Total = " + shortTotal);

    }

    //DateType
    //int has a width of 32 - max value = 2_147_483_647 min value = -2_147_483_648
    //byte has a width of 8 - max value = 127 min value = -128
    //Short has a width of 16 - max value = 32767 min value = 32768
    //long has a width of 64

    //Casting =  assigning data type value to expression
}
