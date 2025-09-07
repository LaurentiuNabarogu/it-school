package com.itschool.session10.homework.ex2;
import java.time.LocalDate;
import java.util.Date;


public class Homework {
    public static void main(String[] args){
        LocalDate birthDate = LocalDate.of(1989, 3, 22);

        displayDateComponents(birthDate);
    }

    /*
    2. Date Decomposition
    Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
    Input: A date in the format YYYY-MM-DD.
    Expected Output:
    makefile
    Copy code
    Year: YYYY
    Month: MM
    Day: DD
     */
    public static void displayDateComponents(LocalDate date){
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);


    }
}
