package com.itschool.session11.homework.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Create a wishlist for christmas with ArrayList and print the values
        ArrayList<String> wishlist = new ArrayList<>(){
            {
                add("Logitech Mouse");
                add("Headphones");
                add("Books");
            }
        };

        for (String element : wishlist){
            System.out.println(element);
        }
    }
}
