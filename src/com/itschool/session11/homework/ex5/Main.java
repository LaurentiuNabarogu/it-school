package com.itschool.session11.homework.ex5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Create an ArrayList that stores city names.
//      Add at least five city names initially.
//      Then, prompt the user to add a city name.
//      If the city name is already in the list, display a message saying it's a duplicate;
//      otherwise, add it to the list.
        List<String> cities = new ArrayList<>(
            List.of("Timisoara", "Arad", "Iasi", "Bucuresti", "Alexandria")
        );

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please introduce a city name:");
        String cityName = userInput.nextLine();
        if (cities.contains(cityName)) {
            System.out.println("This city is a duplicate. Please add a different name.");
        } else {
            cities.add(cityName);
        }
        System.out.println(cities);
    }
}
