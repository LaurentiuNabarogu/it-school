package com.itschool.session11.homework.ex8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] movies = {"Terminator", "Avatar", "The Godfather"};

    public static void main(String[] args) {
//      In an array of strings representing movie titles,
//      implement a linear search method to find whether a given movie title exists.
//      If it does, print out its position in the array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce your movie title:");
        String userInput = sc.nextLine();
        searchingMovieTitle(userInput, movies);
        sc.close();
    }

    public static void searchingMovieTitle(String title, String[] movies) {
        for(int i = 0; i< movies.length; i++){
          if(movies[i].equalsIgnoreCase(title)){
              System.out.println("The position of " +title+ " inside the array is " + i);
          }
        }
    }
}
