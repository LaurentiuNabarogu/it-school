package com.itschool.session11.homework.ex4;

public class Main {
    public static void main(String[] args) {
//        Given an array of 10 integers,
//        count how many of them are even numbers and how many are odd.
//        Print out both counts.
        int[] integers = {1,2,3,4,5,6,7,8,9,10};
        int oddNum = 0;
        int evenNum = 0;
        for (int num : integers){
            if(num % 2 == 0){
                evenNum++;
            }else{
                oddNum++;
            }
        }
        System.out.println("Odd numbers: " + oddNum +"\nEven numbers: "+ evenNum);

    }
}
