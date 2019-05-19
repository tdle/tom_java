package com.tomdale;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 5;

        float myFloatValue = 5f/3f;

        double myDoubleValue = 5d /3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double kilograms = pounds * 0.45359237d;
        System.out.println("The number of Kilograms in " + pounds + " Pounds is equal to = " + kilograms);
        //90.07185
    }

    //int = width of an int 32 (4 Bytes)
    //float = width of a float 32 (4 bytes)
    //double = width of a double = 64 (8 Bytes)
}
