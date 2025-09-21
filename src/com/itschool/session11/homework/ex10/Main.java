package com.itschool.session11.homework.ex10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<ArrayList<String>> diary = new ArrayList<>();
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
        String entry = "2025-09-14, test diary entry";


        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("\tADD \\EDIT \\REMOVE \\SHOW");

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
        String text = userInput.substring(userInput.indexOf(",") + 1);
        ArrayList<String> entry = new ArrayList<>();
        entry.addFirst(date);
        entry.addLast(text);

        if (diary.isEmpty()) {
            diary.addFirst(entry);
        } else {
            for (int i = 0; i < diary.size(); i++) {
                if (LocalDate.parse(date).isEqual(LocalDate.parse(diary.get(i).getFirst()))) {
                    System.out.println("You already have an entry on this date");
                } else if (LocalDate.parse(date).isAfter(LocalDate.parse(diary.get(i).getFirst()))) {
                    if (diary.size() == 1) {
                        diary.addFirst(entry);
                        break;
                    } else {
                        if (i == 0) {
                            diary.addFirst(entry);
                            break;
                        } else {
                            diary.add(i - 1, entry);
                            break;
                        }

                    }

                }
            }
        }
    }

    public static void removeDiaryItem() {
        System.out.println("introduce the date that you want to remove:");
        String itemDate = sc.nextLine();
        diary.removeIf(n -> n.getFirst().equalsIgnoreCase(itemDate));
        System.out.println("You removed the diary for the: " + itemDate);
    }

    public static void showDiary() {
        System.out.println("This is your diary:");
        for (ArrayList<String> el : diary) {
            System.out.println(el);
        }
    }

    public static void editDiaryItem() {
        System.out.println("Introduce the date (YYYY-MM-DD) of the day entry you want to modify: ");
        // Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        for (int i = 0; i < diary.size(); i++) {
            if (diary.get(i).getFirst().equalsIgnoreCase(userInput)) {
                System.out.println("This is your entry for this date: " + diary.get(i).get(1));
                System.out.println("Insert the new entry");
                String modifiedText = sc.nextLine();
                diary.get(i).set(1, modifiedText);
            } else {
                System.out.println("Is no entry with this date.");
            }
        }
    }
}
