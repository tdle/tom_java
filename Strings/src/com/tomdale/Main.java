package com.tomdale;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a String";
        System.out.println("This is my String =  " + "'" + myString + "'");

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
    }
}
