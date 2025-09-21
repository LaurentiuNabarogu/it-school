package com.itschool.session11.homework.ex9;

public class Main {
    public static void main(String[] args) {
//        [Requires knowledge of binary numbers - numbers in base/radix 2:
//        not necessary relevant for Java learning]
//        Accept a string representation of a binary number, e.g., "1011".
//        Convert this string into an Integer using the Integer wrapper class
//        and the method that parses binary. Print out the decimal representation of this number.

        String binaryString = "1011";
        Integer decimalNumber = Integer.parseInt(binaryString, 2);

        System.out.println(decimalNumber);
    }
}
