package com.javarush.task.task17.task1710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                if (args[2] == "м")
                    allPeople.add(Person.createMale(args[1], new Date(args[3])));
                if (args[2] == "ж")
                    allPeople.add(Person.createFemale(args[1], new Date(args[3])));
                break;
            case "-u":
                break;
            case "-d":
                break;
            case "-i":
                break;
        }
    }
}
