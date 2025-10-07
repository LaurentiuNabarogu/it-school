package com.itschool.session11.homework.ex10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> diary = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String userInput1;

    public static void main(String[] args) {
//        Write a program that manages a personal diary using an ArrayList.
//        Each entry in the diary is a string that contains a date in the format "YYYY-MM-DD"
//        followed by a colon and the diary entry for that day. Your program should allow the user to:
//        Add a new entry (but ensure there's no duplicate date).
//        Edit an existing entry based on the date.
//        Delete an entry by date.
//        Display all entries in reverse chronological order (latest first).
//        Ensure that all these operations are efficient, especially the addition of new entries,
//        which should keep the list sorted without resorting it every time.

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("\tADD \\EDIT \\REMOVE \\SHOW \\EXIT");

            userInput1 = sc.nextLine();
            if (userInput1.equalsIgnoreCase("exit")) {
                System.out.println("Closing program");
                sc.close();
                break;
            }
            switch (userInput1.toUpperCase()) {
                case "ADD":
                    newDiaryEntry();
                    break;
                case "EDIT":
                    editDiaryItem();
                    break;
                case "REMOVE":
                    removeDiaryItem();
                    break;
                case "SHOW":
                    showDiary();
                    break;
            }
        }
    }

    public static void newDiaryEntry() {
        System.out.println("Enter your info in the format \"YYYY-MM-DD,some text\"");
        String userInput = sc.nextLine();
        String date = userInput.substring(0, userInput.indexOf(",")).strip();

        if (diary.isEmpty()) {
            diary.addFirst(userInput);
        } else {
            int index = 0;
            while (index < diary.size() && LocalDate.parse(diary.get(index).substring(0, userInput.indexOf(","))).isAfter(LocalDate.parse(date))) {
                index++;
            }
            diary.add(index, userInput);
        }
    }

    public static void removeDiaryItem() {
        System.out.println("Introduce the date that you want to remove:");
        String itemDate = sc.nextLine();
        if (diary.isEmpty()) {
            System.out.println("Your diary is empty.");
        } else if (diary.removeIf(n -> n.substring(0, n.indexOf(",")).equalsIgnoreCase(itemDate))) {
            System.out.println("You removed the diary for the: " + itemDate);
        } else {
            System.out.println("You have no entry with this date.");
        }
    }

    public static void showDiary() {
        if (diary.isEmpty()) {
            System.out.println("Your diary is empty.");
        } else {
            System.out.println("This is your diary:");
            for (String el : diary) {
                System.out.println(el);
            }
        }
    }

    public static void editDiaryItem() {
        System.out.println("Introduce the date (YYYY-MM-DD) of the day entry you want to modify: ");
        String userInput = sc.nextLine();
        boolean matchingDate = false;
        for (int i = 0; i < diary.size(); i++) {
            if (diary.get(i).substring(0, diary.get(i).indexOf(",")).equalsIgnoreCase(userInput)) {
                System.out.println("This is your text for this date: " + diary.get(i).substring(diary.get(i).indexOf(",") + 1));
                System.out.println("Insert the new text:");
                String modifiedText = sc.nextLine();
                diary.set(i, diary.get(i).substring(0, diary.get(i).indexOf(",") + 1) + modifiedText);
                System.out.println("Your diary entry now looks like this: " + diary.get(i));
                matchingDate = true;
                break;
            }
        }
        if (!matchingDate) {
            System.out.println("There is no entry with this date.");
        }
    }
}
