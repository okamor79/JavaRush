package com.javarush.task.task10.task1015;

        import java.util.ArrayList;
        import java.util.Random;

/*
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        Random rnd = new Random();
        int arraySize = rnd.nextInt(100)+1;
        ArrayList<String>[] list = new ArrayList[1];
        for (int i = 0; i < list.length ; i++) {
            list[i] = new ArrayList<>();
            for (int j = 0; j < rnd.nextInt(20) + 1; j++) {
                list[i].add("String" + i + j);
            }
        }
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}