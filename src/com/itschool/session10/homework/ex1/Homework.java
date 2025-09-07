package com.itschool.session10.homework.ex1;
import java.time.LocalDate;
public class Homework {
    public static void main(String[] args) {
        displayTodaysDate();
    }

    /*
     1. Displaying Today's Date
     Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
     Expected Output: Today's date in the format YYYY-MM-DD.
     */
    public static void displayTodaysDate(){

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);
    }

}
