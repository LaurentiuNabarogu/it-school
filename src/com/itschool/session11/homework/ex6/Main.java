package com.itschool.session11.homework.ex6;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Given a LinkedList storing student names,
//      write a program that checks if a particular student name exists in the list.
//      If it does, remove that name from the list.
        LinkedList<String> studentNames = new LinkedList<String>(Arrays.asList("Gigel", "Bula", "Strula", "Itzik"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce the student name: ");
        String userInput = sc.nextLine();
        if (studentNames.contains(userInput)) {
            studentNames.remove(userInput);
        }
        System.out.println(studentNames);
    }
}
