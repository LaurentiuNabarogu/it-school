package com.itschool.session10.homework.ex3;

import java.time.LocalDate;

public class Homework {
    public static void main(String[] args) {
        LocalDate objDate = createSpecificDate(2025, 8, 19);
        System.out.println(objDate);
    }

    /*
    3. Create a Specific Date
    Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
    Expected Output: A date object for 2025-8-19.
     */

    public static LocalDate createSpecificDate(int year, int month, int day){
        LocalDate theDate = LocalDate.of(year, month, day);
        return theDate;
    }
}
