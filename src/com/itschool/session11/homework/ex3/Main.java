package com.itschool.session11.homework.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        Create:
        -2 empty ArrayLists: studentList and graduateStudentList
        -populate studentList with 10 students
        -copy values from studentList to graduateStudentList
        -iterate through graduateStudentList and print each graduated student
        */
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        String[] students = {"Ion","Vasile","Carina", "Miruna", "Laurentiu", "Cosmin", "Gheorghe", "Viorel","Tatiana","Nina"};
        for (String student : students){
            studentList.add(student);
        }

        graduateStudentList.addAll(studentList);

      for(String gradStudent : graduateStudentList){
          System.out.println(gradStudent);
      }
    }
}
