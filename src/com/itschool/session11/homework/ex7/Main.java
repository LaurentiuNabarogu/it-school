package com.itschool.session11.homework.ex7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Create an ArrayList containing names of fruits.
//        Implement a custom sorting mechanism to arrange them in descending order based on their length.
//        If two fruits have the same length, sort them in alphabetical order.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("avocado");
        fruits.add("mere");
        fruits.add("kiwi");
        fruits.add("pere");
        fruits.add("banane");
        fruits.add("ananas");

        ArrayList<String> sizeSortedArrList = customSort(fruits);

    }

    public static ArrayList<String> customSort(ArrayList<String> arr) {

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j).length() == arr.get(j + 1).length()) {
                    ArrayList<String> sortedWords = alphabeticalSort(arr.get(j), arr.get(j + 1));
                    arr.set(j, sortedWords.get(0));
                    arr.set(j + 1, sortedWords.get(1));
                } else if (arr.get(j).length() < arr.get(j + 1).length()) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        System.out.println("array " + arr);
        return arr;
    }

    public static ArrayList<String> alphabeticalSort(String word1, String word2) {
        char[] word1CharsArr = word1.toLowerCase().toCharArray();
        char[] word2CharsArr = word2.toLowerCase().toCharArray();
        ArrayList<String> abSortElements = new ArrayList<>();
        for (int i = 0; i < word1.length() - 1; i++) {
            if (word1CharsArr[i] == word2CharsArr[i]) {
                continue;
            } else if (word1CharsArr[i] > word2CharsArr[i]) {
                abSortElements.add(word2);
                abSortElements.add(word1);
                break;
            } else {
                abSortElements.add(word1);
                abSortElements.add(word2);
                break;
            }
        }
        return abSortElements;
    }
}
